package com.example.eureka.server002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Zozo
 * @date
 */
@SpringBootApplication
@EnableEurekaServer
public class Server002Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Server002Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Server002Application.class);
    }
}