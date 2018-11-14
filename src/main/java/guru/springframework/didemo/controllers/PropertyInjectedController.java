package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

/**
 * Created by EQejvanaj on 13-Nov-18
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
