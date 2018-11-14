package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by EQejvanaj on 14-Nov-18
 */

@Controller
public class ConstructerInjectedController {

    private GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
