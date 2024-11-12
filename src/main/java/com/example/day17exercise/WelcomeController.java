package com.example.day17exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/name")
    public String getName (){
        return "My name is Ahmed!";
    }

    @GetMapping("/age")
    public String getAge (){
        return "My Age is 23";
    }

    @GetMapping("/check/status")
    public String checkStatus (){
        return "Every thing is OK! ";
    }

    @GetMapping("/health")
    public String getHealth (){
        return "Server health is up and running!";
    }

    @GetMapping("/names")
    public String [] getNames (){
        String[] names = new String[4];
        names[0] = "Ahmed";
        names[1] = "Essam";
        names[2]= "JSON";
        names[3] = "Taj";

        return names;
    }



}
