package com.example.blueSmith.calender.mapper;

import com.example.blueSmith.calender.dto.CalenderDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CalenderMapper {
    CalenderDto getCalender();
}
