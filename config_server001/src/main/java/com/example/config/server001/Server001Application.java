package com.example.config.server001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Zozo
 */
@EnableConfigServer
@SpringBootApplication
public class Server001Application {

    public static void main(String[] args) {
        SpringApplication.run(Server001Application.class, args);
    }

}

