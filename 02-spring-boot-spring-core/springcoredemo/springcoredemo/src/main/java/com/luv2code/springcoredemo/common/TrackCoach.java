package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //Specify one class
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("In constructor "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5k!";
    }
}
