package com.dev.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Jakez on 24/02/2018.
 */

@Service
@Profile("en")
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, from PrimaryGreetingService";
    }
}
