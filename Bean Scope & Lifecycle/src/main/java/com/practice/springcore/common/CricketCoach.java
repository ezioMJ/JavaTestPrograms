package com.practice.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Contructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice batting for 1hr!!!";
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff() : " + getClass().getSimpleName());
    } 

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() : " + getClass().getSimpleName());
    }
}
