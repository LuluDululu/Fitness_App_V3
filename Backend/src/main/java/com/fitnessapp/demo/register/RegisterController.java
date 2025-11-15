package com.fitnessapp.demo.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("register")
    public list<registerDTO> register() {
        String sql = "SELECT username, password, age FROM users";

        List<registerDTO> list = jdbcTemplate.query(sql, (rs, rowNum) -> new registerDTO(
                rs.getString("username"),
                rs.getString("password"),
                rs.getInt("age")
        ));

        return responseEntity.ok(list);
    }


    }

