package com.yuze.springboot.playground1.restController;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    //use constructor injection when you have required dependencies


    @Autowired
    public CoachController(@Qualifier("cricketCoach") Coach coach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
    }

    /*
    //use setter injections when you have optional dependencies
    @Autowired
    public void setCricketCoach(@Qualifier("cricketCoach") Coach coach){
        myCoach = coach;
    }

    //the same setter dependency injection can be achieved by any methods
    @Autowired
    public void showDependencyInjection(@Qualifier("cricketCoach") Coach coach){
        myCoach = coach;
    }
    */

    @GetMapping("/cricketworkout")
    public String getCricketWorkout(){
        return myCoach.getDailyWorkout();
    }

}
