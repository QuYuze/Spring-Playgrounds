package com.yuze.springboot.playground1.restControler;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    @Autowired
    public CoachController(Coach coach){
        myCoach = coach;
    }

    @Autowired
    public void setCoach(Coach coach){
        myCoach = coach;
    }

    //the same setter dependency injection can be achieved by any methods
    @Autowired
    public void showDependencyInjection(Coach coach){
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
