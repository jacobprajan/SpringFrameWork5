package com.dev.controllers;

import com.dev.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Jakez on 23/02/2018.
 */

// This is the best approach as object should be created with all dependencies before calling its method

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Here autowiring is not required as spring will do this by default
    // But it is a good habit to put @Autowired here
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }



}
