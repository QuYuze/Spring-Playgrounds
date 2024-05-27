package com.yuze.springboot.playground1.restController;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowSingletonController {

    private Coach firstCoach;
    private Coach anotherCoach;

    @Autowired
    public ShowSingletonController(@Qualifier("cricketCoach") Coach coachA, @Qualifier("cricketCoach") Coach coachB){
        firstCoach = coachA;
        anotherCoach = coachB;
    }

    @GetMapping("checkingSingleton")
    public String checkingSingleton(){
        return "Comapring two Coach: " + (firstCoach == anotherCoach);
    }

}
