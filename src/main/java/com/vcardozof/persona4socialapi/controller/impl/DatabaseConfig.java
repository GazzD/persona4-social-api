package com.vcardozof.persona4socialapi.controller.impl;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @PostConstruct
    public void init() {
        System.out.println("Database URL: " + dbUrl);
        System.out.println("Database Username: " + dbUsername);
        System.out.println("Database Password: " + dbPassword);
    }
}
