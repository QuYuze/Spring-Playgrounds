package com.yuze.springboot.playground1.dependencyClasses;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In contrsuctor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim Practice";
    }
}
