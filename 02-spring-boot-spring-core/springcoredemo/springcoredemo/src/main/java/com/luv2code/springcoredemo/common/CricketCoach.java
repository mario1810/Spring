package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach  implements Coach{

    public CricketCoach() {
        System.out.println("In constructor "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        //During bean initialization and before dependency injection
        System.out.println("Post construct "+ getClass().getSimpleName());
    }

    @PreDestroy // Doesnt work for prototype scope
    public void doMyCleanUpStuff(){
        System.out.println("Pre destroy "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice  fast bowling for 15 minutes!!";
    }
}
