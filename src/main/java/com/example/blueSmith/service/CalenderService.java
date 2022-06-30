package com.example.blueSmith.service;

import com.example.blueSmith.mapper.CalenderMapper;
import com.example.blueSmith.dto.CalenderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalenderService {
    private final CalenderMapper mapper;

    public CalenderService(CalenderMapper mapper) {
        this.mapper = mapper;
    }

    public CalenderDto getCalender(CalenderDto calenderDto) {
        log.debug("getCalender calenderDto ==> {}", calenderDto);
        return mapper.getCalender();
    }


}
