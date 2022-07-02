package com.example.blueSmith.user.controller;

import com.example.blueSmith.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController
{
    final UserService userService;

    @RequestMapping("/test")
    public void test(@Param("email") String email, @Param("nickname") String nickname, @Param("password") String password, @Param("grade") int grade) {
        userService.test(email, nickname, password, grade);
    }
}
