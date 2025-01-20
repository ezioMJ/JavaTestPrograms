package com.practice.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice Fielding for 30 mins";
    }
}
