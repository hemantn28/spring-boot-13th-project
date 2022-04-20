package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/hellome/{name}")
    public String messageMe(@PathVariable String name){
        return "Your most welcome"+name;
    }
    
    @RequestMapping("/my_age2/{age2}")
    public String printAge(@PathVariable int age2){
       if (age2>=18){
           return "You are an adult";
       }
       else{
           return "You are a minor";
       }
    }

    @RequestMapping("/mySpeed/{speed}")
    public String checkSpeed(@PathVariable int speed){
        if (speed>80){
            return "You are driving fast";
        }
        else{
            return "You are driving slow";
        }
    }

    @RequestMapping("/my_numbers/{numbers}")
    public String checkNumber(@PathVariable int numbers){
        if (numbers>90){
            return "extraordinary";
        }
        else if (numbers>75){
            return "brilliant";
        }
        else if (numbers>60){
            return "intelligent";
        }
        else{
            return "moderate";
        }
    }

    @RequestMapping("/mySalary/{salary}")
    public String checkingSalary(@PathVariable int salary){
        if (salary>1000000){
            return "Your package is high";
        }
        else if (salary>80000){
            return "Your package is very good";
        }
        else if (salary>60000){
            return "your package is good";
        }
        else{
            return "Your package is moderate";
        }
    }




}
