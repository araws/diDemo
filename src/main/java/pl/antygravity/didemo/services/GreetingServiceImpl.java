package pl.antygravity.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_EVERYBODY = "Hello Everybody!!!";

    @Override
    public String sayGreeting() {
        return HELLO_EVERYBODY;
    }
}
