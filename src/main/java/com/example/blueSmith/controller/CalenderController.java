package com.example.blueSmith.controller;

import com.example.blueSmith.dto.CalenderDto;
import com.example.blueSmith.service.CalenderService;
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
