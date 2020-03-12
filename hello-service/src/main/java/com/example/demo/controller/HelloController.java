package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * TODO 写点注释吧
 *
 * @author jin
 * @date 2020/3/1
 */
@RestController
public class HelloController {
    Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host: " + serviceInstance.getHost() + ", service_id: " + serviceInstance.getServiceId());
        return "hello world.";
    }
}
