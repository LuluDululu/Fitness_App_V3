package com.fitnessapp.demo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    JdbcTemplate jdbcTemplate;

    @GetMapping("/login")
    public String userTest(){
        System.out.println("works!");
        return "this link works!";

    }
}
