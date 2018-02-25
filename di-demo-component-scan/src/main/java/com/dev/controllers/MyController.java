package com.dev.controllers;

import com.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Jakez on 22/02/2018.
 */

//@Controller -> indicates its a spring bean
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }

}
