package com.example.blueSmith.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private String email;
    private String nickname;
    private String password;
    private int grade;

}
