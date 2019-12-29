package pl.antygravity.didemo.controllers;

import pl.antygravity.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
