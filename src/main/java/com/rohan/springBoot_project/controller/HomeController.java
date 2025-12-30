package com.rohan.springBoot_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
//        System.out.println("its working and you are in home");
        return "welcome to home.";
    }

    @RequestMapping("/about")
    public String about(){
        return "this in in about page.";
    }
}
