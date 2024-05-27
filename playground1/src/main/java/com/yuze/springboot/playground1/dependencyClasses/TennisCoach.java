package com.yuze.springboot.playground1.dependencyClasses;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In contrsuctor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Tennis Workouts";
    }
}
