package com.yuze.springboot.playground1.dependencyClasses;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In contrsuctor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Running 5k!";
    }
}
