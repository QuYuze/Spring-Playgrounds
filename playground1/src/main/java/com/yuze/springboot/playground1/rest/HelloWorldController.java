package com.yuze.springboot.playground1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //expose "/" that returns Hello World
    @GetMapping("/")
    public String seyHelloWorld(){
        return "Hello World";
    }
}
