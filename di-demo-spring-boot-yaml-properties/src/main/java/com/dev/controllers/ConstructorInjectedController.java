package com.dev.controllers;

import com.dev.services.GreetingService;

/**
 * Created by Jakez on 23/02/2018.
 */

// This is the best approach as object should be created with all dependencies before calling its method
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }



}
