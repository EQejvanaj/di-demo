package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by EQejvanaj on 14-Nov-18
 */

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer Grussdienst";
    }
}
