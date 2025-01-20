package com.practice.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Contructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice batting for 1hr!!!";
    }
}
