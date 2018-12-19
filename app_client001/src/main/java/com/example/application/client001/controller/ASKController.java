package com.example.application.client001.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 16:11
 */
@Slf4j
@RestController
public class ASKController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ask")
    public String ask(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello/{name}",
                String.class, "贾广召").getBody();
    }
}
