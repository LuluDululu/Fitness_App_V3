package com.fitnessapp.demo.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @GetMapping("/register")
    public String registerUser(){
        return "registered";
    }
}
