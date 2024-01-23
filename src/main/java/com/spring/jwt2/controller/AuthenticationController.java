package com.spring.jwt2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jwt2.model.ApplicationUser;
import com.spring.jwt2.model.LoginResponseDTO;
import com.spring.jwt2.model.RegistrationDTO;
import com.spring.jwt2.service.AuthenticationService;

/**
 * AuthenticationController
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body){
        return authenticationService.RegisterUser(body.getUsername(), body.getPassword());
    }
    @PostMapping("/login")
    public LoginResponseDTO loginResponseDTO(@RequestBody RegistrationDTO body){
        return authenticationService.loginResponseDTO(body.getUsername(), body.getPassword());
    }
}