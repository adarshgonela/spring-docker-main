package com.ajtech.springdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping
    public String getMessage(){
        return "Welcome to SpringBoot Docker";
    }

    @GetMapping("/hi")
    public String getMessage1(){
        return "i am hi";
    }
}



