package com.example.blueSmith.user.mapper;

import com.example.blueSmith.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper
{
    void save(UserDto userDto);
}
