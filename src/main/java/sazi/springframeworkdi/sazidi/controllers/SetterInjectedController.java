package sazi.springframeworkdi.sazidi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sazi.springframeworkdi.sazidi.services.GreetingService;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
