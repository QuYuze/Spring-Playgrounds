package com.yuze.springboot.playground1.restController;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowConfigBean {


    private Coach myCoach;

    @Autowired
    public ShowConfigBean(@Qualifier("swimCoach") Coach coach){
        System.out.println("In contrsuctor: " + getClass().getSimpleName());
        myCoach = coach;

    }
}
