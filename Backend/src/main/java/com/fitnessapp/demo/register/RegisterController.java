package com.fitnessapp.demo.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RegisterController {

    @GetMapping("/register")
    public String registerUser(){
        ArrayList<RegisterDAO> list = new ArrayList<>();
        list.registerUser();


        return "registered";
    }
}
