package com.dev.controllers;

import com.dev.services.GreetingService;
import com.dev.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by Jakez on 23/02/2018.
 */

// This is a case study of "NOT TO BE DONE" in this way. This is bad practice
// Injecting implementation is bad

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
