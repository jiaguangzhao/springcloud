package com.example.feign001.controller.service;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 17:33
 */
@FeignClient(name = "EUREKA-CLIENT")
public interface FeignClientService {


    /**
     * 测试 Feign
     * @param applicationName
     * @return
     */
    @GetMapping("/service-instances/{applicationName}")
    ServiceInstance getInstanceByServerId(@PathVariable String applicationName);
}
