package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by EQejvanaj on 14-Nov-18
 */
@Service
@Profile("de")
@Primary
public class GermanyPrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primarer Grussdienst";
    }
}
