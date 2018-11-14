package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by EQejvanaj on 14-Nov-18
 */
@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor";
    }
}
