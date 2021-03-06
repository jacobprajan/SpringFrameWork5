package com.dev.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Jakez on 24/02/2018.
 */

// This is the default profile when there is no active profile configured
@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, from PrimaryGreetingService";
    }
}
