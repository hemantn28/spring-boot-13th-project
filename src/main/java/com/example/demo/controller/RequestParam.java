package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam {
    @RequestMapping("/message")
    public String hello(@org.springframework.web.bind.annotation.RequestParam String name){
        return "Welcome to Request Param "+name;
    }

    @RequestMapping("/hello")
    public String message(@org.springframework.web.bind.annotation.RequestParam String name){
        return "Where are you going? "+name;
    }

    @RequestMapping("/division")
    public String marks(@org.springframework.web.bind.annotation.RequestParam int marks){

        if (marks>75){

            return "first division...";
        }
        else{
            return "passed";
        }

        }


        @RequestMapping("/add")
        public String addition(@org.springframework.web.bind.annotation.RequestParam int a,@org.springframework.web.bind.annotation.RequestParam int b){

        int c=a+b;
        return "addition is: "+c;
        }

        @RequestMapping("/addition")
        public int add(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        int c=a+b;
        return c;
        }


        @RequestMapping("/addify")
        public String plus(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        return "addition is "+(a+b);
        }

        @RequestMapping("/subtraction")
        public String subtract(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){

        return "minus is: "+(a-b);
        }

        @RequestMapping("/minus")
        public String subtraction(@org.springframework.web.bind.annotation.RequestParam int a,@org.springframework.web.bind.annotation.RequestParam int b){
        int c=a-b;
        return "subtract is: "+c;
        }

        @RequestMapping("/subtract")
        public int minus(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        int c=a-b;
        return c;
        }

        @RequestMapping("/multiplication")
        public String multiply(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        int c=a*b;
        return "multiplication is: "+c;
        }

        @RequestMapping("/multiply")
        public String multiplication(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        return "multiplication is: "+(a*b);
        }

        @RequestMapping("/multiply2")
        public int into(@org.springframework.web.bind.annotation.RequestParam int a,@org.springframework.web.bind.annotation.RequestParam int b){
        int c=a*b;
        return c;
        }

        @RequestMapping("/divide")
        public String division(@org.springframework.web.bind.annotation.RequestParam int a, @org.springframework.web.bind.annotation.RequestParam int b){
        return "division is "+(a/b);
        }

        @RequestMapping("/divide2")
        public String divide1(@org.springframework.web.bind.annotation.RequestParam int a,@org.springframework.web.bind.annotation.RequestParam int b){
        int c=a/b;
        return "division is "+c;
        }

        @RequestMapping("dividation")
        public int divide3(@org.springframework.web.bind.annotation.RequestParam int a,@org.springframework.web.bind.annotation.RequestParam int b){
        int c=a/b;
        return c;
        }

        @RequestMapping("/your_age")
        public int checkAge(@org.springframework.web.bind.annotation.RequestParam int age){
        return 23;
        }

    }


