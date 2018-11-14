package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by EQejvanaj on 13-Nov-18
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }

}
