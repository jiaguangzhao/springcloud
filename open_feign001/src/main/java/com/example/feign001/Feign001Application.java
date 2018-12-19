package com.example.feign001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Zozo
 */
@EnableFeignClients
@SpringBootApplication
public class Feign001Application {

    public static void main(String[] args) {
        SpringApplication.run(Feign001Application.class, args);
    }

}

