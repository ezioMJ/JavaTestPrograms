package com.practice.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Contructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run 1km";
    }
}
