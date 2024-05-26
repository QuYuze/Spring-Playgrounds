package com.yuze.springboot.playground1.restControler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {

    @GetMapping("/Date")
    public String getDate(){
        Date date = new Date();
        return date.toString();
    }
}
