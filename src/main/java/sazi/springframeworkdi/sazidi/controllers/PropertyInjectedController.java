package sazi.springframeworkdi.sazidi.controllers;

import sazi.springframeworkdi.sazidi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
