package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by EQejvanaj on 14-Nov-18
 */
public class ConstructerInjectedController {

    private GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
