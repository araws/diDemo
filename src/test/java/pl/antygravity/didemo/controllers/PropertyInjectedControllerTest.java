package pl.antygravity.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import pl.antygravity.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl  = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() throws Exception {

        assertEquals(GreetingServiceImpl.HELLO_EVERYBODY, propertyInjectedController.sayHello());
    }
}
