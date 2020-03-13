package com.example.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="HELLO-SERVICE")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello1")
    String hello1(@RequestParam("name") String name);

    @RequestMapping("/hello2")
    String hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello3(@RequestBody User user);



}