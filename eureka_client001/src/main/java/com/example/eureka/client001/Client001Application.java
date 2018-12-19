package com.example.eureka.client001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Zozo
 */
@SpringBootApplication
public class Client001Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Client001Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Client001Application.class);
    }
}

