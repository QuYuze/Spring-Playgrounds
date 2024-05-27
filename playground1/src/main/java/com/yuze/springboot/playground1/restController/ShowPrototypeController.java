package com.yuze.springboot.playground1.restController;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowPrototypeController {
    private Coach firstCoach;
    private Coach anotherCoach;

    @Autowired
    public ShowPrototypeController(@Qualifier("baseballCoach") Coach coachA, @Qualifier("baseballCoach") Coach coachB){
        firstCoach = coachA;
        anotherCoach = coachB;
    }

    @GetMapping("/checkingPrototype")
    public String checkingPrototype(){
        return "Comparing two Coach: " + (firstCoach == anotherCoach);
    }
}
