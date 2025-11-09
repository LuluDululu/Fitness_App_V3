package com.fitnessapp.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @GetMapping("/login")
    public String userTest(){
        System.out.println("works!");
        return "this link works!";

    }
}
