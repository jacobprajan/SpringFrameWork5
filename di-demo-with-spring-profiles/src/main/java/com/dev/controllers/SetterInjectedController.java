package com.dev.controllers;

import com.dev.services.GreetingService;
import com.dev.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Jakez on 23/02/2018.
 */

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // @Qualifier >> to select bean to be injected
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
