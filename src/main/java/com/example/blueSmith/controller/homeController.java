package com.example.blueSmith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController
{
    @GetMapping("/login")
    public String login() {
        return "Login Test";
    }
}
