package com.dev.controllers;

import com.dev.services.GreetingServiceImpl;

/**
 * Created by Jakez on 23/02/2018.
 */

// This is a case study of "NOT TO BE DONE" in this way. This is bad practice
// Injecting implementation is bad

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
