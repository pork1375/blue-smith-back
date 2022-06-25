package com.example.blueSmith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloWorldController
{
    @GetMapping("/hello")
    public String test() {
        return "Hello, world!";
    }
}
