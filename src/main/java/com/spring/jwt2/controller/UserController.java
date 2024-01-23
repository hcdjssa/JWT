package com.spring.jwt2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @GetMapping("/")
    public String helloUserController(){
        return "User level access";
    }
    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }
    @GetMapping("/page2")
    public String page2(){
        return "page2";
    }
    @GetMapping("/pag3")
    public String page3(){
        return "page3";
    }
}
