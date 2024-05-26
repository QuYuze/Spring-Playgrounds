package com.yuze.springboot.playground1.dependencyClasses;

import org.springframework.stereotype.Component;

//mark this class as spring bean for dependency injections
//spring bean are java class managed by spring
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15min.";
    }
}
