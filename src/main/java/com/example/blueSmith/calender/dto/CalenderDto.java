package com.example.blueSmith.calender.dto;

import lombok.Data;

@Data
public class CalenderDto {

    private int id; // 순번
    private String startDate;   // 시작날짜
    private String endDate; // 종료날짜

}