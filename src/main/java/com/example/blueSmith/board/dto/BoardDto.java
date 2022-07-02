package com.example.blueSmith.board.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class BoardDto {

//    private int boardNum; // 게시글 번호
    @Value("KJH")
    private String userId;   // 작성자
    @Value("today")
    private String wDate; // 작성일자
    @Value("testTitle")
    private String title; // 제목
    @Value("testContent")
    private String content; // 내용


}