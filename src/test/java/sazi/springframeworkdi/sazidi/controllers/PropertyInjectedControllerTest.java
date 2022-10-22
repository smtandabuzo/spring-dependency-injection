package sazi.springframeworkdi.sazidi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sazi.springframeworkdi.sazidi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}