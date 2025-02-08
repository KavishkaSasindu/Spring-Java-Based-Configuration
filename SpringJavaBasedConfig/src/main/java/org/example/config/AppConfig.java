package org.example.config;

import org.example.Alien;
import org.example.App;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public Alien alien() {
        return new Alien();
    }
}
