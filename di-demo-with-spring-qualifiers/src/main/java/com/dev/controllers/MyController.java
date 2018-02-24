package com.dev.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Jakez on 22/02/2018.
 */

//@Controller -> indicates its a spring bean
@Controller
public class MyController {

    public void hello() {
        System.out.println("Hello!!!");
    }

}
