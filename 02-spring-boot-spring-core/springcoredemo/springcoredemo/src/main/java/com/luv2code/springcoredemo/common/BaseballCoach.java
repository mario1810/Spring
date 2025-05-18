package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes in batting practice!";
    }
}
