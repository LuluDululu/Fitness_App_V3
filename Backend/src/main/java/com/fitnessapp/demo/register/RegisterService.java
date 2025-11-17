package com.fitnessapp.demo.register;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final RegisterDAO registerDAO;

    public RegisterService(RegisterDAO registerDAO){
        this.registerDAO = registerDAO;
    }

    public void register(RegisterDTO registerCustomer){
        registerDAO.createUser(registerCustomer);
    }
}
