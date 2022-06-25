package com.example.blueSmith.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/api/hello")
    public String test() {
        System.out.println("aaaa");
        return "Hello, world!";
    }

}
