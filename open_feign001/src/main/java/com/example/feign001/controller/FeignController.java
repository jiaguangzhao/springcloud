package com.example.feign001.controller;

import com.example.feign001.controller.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 17:23
 */
@RestController
public class FeignController {

    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/hello/{name}")
    public ServiceInstance getInstanceByServiceId(@PathVariable String name) {
        return feignClientService.getInstanceByServerId(name);
    }
}