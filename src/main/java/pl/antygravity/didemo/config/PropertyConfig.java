package pl.antygravity.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.antygravity.didemo.examplebeans.FakeDataSource;
import pl.antygravity.didemo.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

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
        fakeDataSource.setUser(user);
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
}
