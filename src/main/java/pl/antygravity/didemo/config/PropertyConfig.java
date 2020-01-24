package pl.antygravity.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import pl.antygravity.didemo.examplebeans.FakeDataSource;
import pl.antygravity.didemo.examplebeans.FakeJmsBroker;

@Configuration
@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${anty.user}")
    String user;

    @Value("${anty.password}")
    String password;

    @Value("${anty.url}")
    String url;

    @Value("${anty.jms.user}")
    String jmsUsername;

    @Value("${anty.jms.password}")
    String jmsPassword;

    @Value("${anty.jms.url}")
    String jmsURL;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsURL);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
