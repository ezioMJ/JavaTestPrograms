package com.practice.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.util.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(Coach thisCoach){
        myCoach = thisCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
