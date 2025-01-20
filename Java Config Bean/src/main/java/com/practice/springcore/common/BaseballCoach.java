package com.practice.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In Contructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice Fielding for 30 mins";
    }
}
