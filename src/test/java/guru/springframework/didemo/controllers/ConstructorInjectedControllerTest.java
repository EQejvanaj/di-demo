package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by EQejvanaj on 14-Nov-18
 */
public class ConstructorInjectedControllerTest {

    private ConstructerInjectedController constructerInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructerInjectedController = new ConstructerInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructerInjectedController.sayHello());
    }
}
