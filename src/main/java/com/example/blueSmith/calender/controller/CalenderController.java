package com.example.blueSmith.calender.controller;

import com.example.blueSmith.calender.dto.CalenderDto;
import com.example.blueSmith.calender.service.CalenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CalenderController {

    @Autowired
    CalenderService calenderService;

    @RequestMapping("/calender/test")
    public CalenderDto getCalender(CalenderDto calenderDto) {
        return calenderService.getCalender(calenderDto);
    }

}
