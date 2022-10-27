package sazi.springframeworkdi.sazidi.controllers;

import org.springframework.stereotype.Controller;
import sazi.springframeworkdi.sazidi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
