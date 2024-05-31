package com.yuze.springboot.playground_REST_CRUD_APIs.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class demoController {

    //code for /hello endpoints
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
