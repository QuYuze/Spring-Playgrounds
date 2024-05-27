package com.yuze.springboot.playground1.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InjectProperties {

    //inject property for: author
    @Value("${author}")
    private String author;

    @GetMapping("/author")
    private String getAuthor(){
        return  "Author: " + author;
    }

}
