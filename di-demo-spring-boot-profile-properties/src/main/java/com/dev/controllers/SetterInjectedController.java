package com.dev.controllers;

import com.dev.services.GreetingService;
import com.dev.services.GreetingServiceImpl;

/**
 * Created by Jakez on 23/02/2018.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
