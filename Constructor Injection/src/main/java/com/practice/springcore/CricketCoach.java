package com.practice.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice batting for 1hr!!!";
    }
}
