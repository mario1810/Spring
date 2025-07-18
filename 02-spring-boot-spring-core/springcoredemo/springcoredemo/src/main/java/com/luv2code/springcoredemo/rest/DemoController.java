package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //Qualifier has higher priority

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    /*
    @Autowired
    public DemoController( Coach theCoach){
        myCoach = theCoach;
    }*/
    @GetMapping("/dailyworkout")
    public String getDailyworkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach " + (myCoach==anotherCoach);
    }
}
