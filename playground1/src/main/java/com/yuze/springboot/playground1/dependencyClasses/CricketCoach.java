package com.yuze.springboot.playground1.dependencyClasses;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//mark this class as spring bean for dependency injections
//spring bean are java class managed by spring
@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In contrsuctor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15min.";
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(getClass().getSimpleName() + ": post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(getClass().getSimpleName() + ": Pre Destroy");
    }
}
