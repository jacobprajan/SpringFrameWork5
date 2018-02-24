package com.dev.services;

import org.springframework.stereotype.Service;

/**
 * Created by Jakez on 24/02/2018.
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, I was injected by setter!!!";
    }
}
