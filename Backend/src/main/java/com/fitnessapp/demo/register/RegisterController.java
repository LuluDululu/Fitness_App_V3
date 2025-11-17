package com.fitnessapp.demo.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RegisterService registerService;


    public RegisterController(RegisterService registerService){
        this.registerService = registerService;
    }
    /*

    @GetMapping("/registers")
    public ResponseEntity<List<RegisterDTO>> register() {
        String sql = "SELECT username, password, age FROM users";

        List<RegisterDTO> list = jdbcTemplate.query(
                sql,
                (rs, rowNum) -> {
                    RegisterDTO register = new RegisterDTO();
                    register.setAge(rs.getInt("age"));
                    register.setUsername(rs.getString("username"));
                    register.setPassword(rs.getString("password"));
                return register;
                }
        );

        return ResponseEntity.ok(list);
    }

     */

    @PostMapping("/register")
    public ResponseEntity<String> registerUser (@RequestBody RegisterDTO user){
       registerService.register(user);
       return ResponseEntity.ok("user registered succesfully");
    }


}

