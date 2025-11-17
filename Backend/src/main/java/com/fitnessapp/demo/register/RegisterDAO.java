package com.fitnessapp.demo.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAO {

    @Autowired
    JdbcTemplate jdbctemplate;

    public RegisterDTO createUser(RegisterDTO userdata){
        String sql = "INSERT into users (username, password, age) VALUES (?, ?, ?)";
        jdbctemplate.update( sql,
                userdata.getUsername(),
                userdata.getPassword(),
                userdata.getAge()
        );
        return userdata;
    }

}
