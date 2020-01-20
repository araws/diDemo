package pl.antygravity.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreetings() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreetings() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreetings() {
        return "Primärer Grußdienst";
    }
}
