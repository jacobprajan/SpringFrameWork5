package com.dev.services;

import org.springframework.stereotype.Service;

/**
 * Created by Jakez on 23/02/2018.
 */

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello Jakez!!!";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
