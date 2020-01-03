package pl.antygravity.didemo.controllers;

import org.springframework.stereotype.Controller;
import pl.antygravity.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
