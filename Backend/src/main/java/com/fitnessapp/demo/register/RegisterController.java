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

    @GetMapping("/register")
    public ResponseEntity<List<RegisterDTO>> registerUser() {

        List<RegisterDTO> list = jdbcTemplate.query(
                "SELECT username, password, age FROM users\n",
                new RowMapper<RegisterDTO>() {
                    @Override
                    public RegisterDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                        RegisterDTO user = new RegisterDTO();
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setAge(rs.getInt("age"));
                        return user;
                    }
                }
             );

        return ResponseEntity.ok(list);
        }
    }

