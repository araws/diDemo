package pl.antygravity.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.antygravity.didemo.controllers.ConstructorInjectedController;
import pl.antygravity.didemo.controllers.MyController;
import pl.antygravity.didemo.controllers.PropertyInjectedController;
import pl.antygravity.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println(controller.sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
