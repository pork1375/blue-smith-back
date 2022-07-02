package com.example.blueSmith.user.service;

import com.example.blueSmith.user.dto.UserDto;
import com.example.blueSmith.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
    final private UserMapper usermapper;

    public void test(String email, String nickname, String password, int grade){
        UserDto dto = new UserDto();
        dto.setEmail(email);
        dto.setNickname(nickname);
        dto.setPassword(password);
        dto.setGrade(grade);

        usermapper.save(dto);
    }
}
