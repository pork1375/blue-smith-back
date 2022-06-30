package com.example.blueSmith.mapper;

import com.example.blueSmith.dto.CalenderDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CalenderMapper {
    CalenderDto getCalender();
}
