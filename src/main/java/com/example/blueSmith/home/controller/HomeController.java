package com.example.blueSmith.home.controller;

import com.example.blueSmith.home.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController
{
    final HomeService homeService;

    @RequestMapping("/")
    public String justHome() {
        return "Home Page";
    }

    @GetMapping("/login")
    public String login() {
        return "Login Test";
    }
}
