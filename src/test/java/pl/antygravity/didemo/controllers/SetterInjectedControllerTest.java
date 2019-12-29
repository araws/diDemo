package pl.antygravity.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.antygravity.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_EVERYBODY, setterInjectedController.sayHello());
    }
}
