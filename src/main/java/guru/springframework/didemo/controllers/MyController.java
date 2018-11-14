package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by EQejvanaj on 13-Nov-18
 */

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello!!! ");
        return null;
    }
}
