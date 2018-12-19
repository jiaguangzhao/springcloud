package com.example.eureka.server003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Zozo
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Server003Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Server003Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Server003Application.class);
    }
}

