package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO 写点注释吧
 *
 * @author jin
 * @date 2020/3/1
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String index() {
        // 不使用 Hystrix
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        // 使用 Hystrix
        return helloService.helloService();
    }
}
