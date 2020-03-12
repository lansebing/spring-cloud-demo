package com.example.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="HELLO-SERVICE")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();



}