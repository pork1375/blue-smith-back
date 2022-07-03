package com.example.blueSmith.board.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class BoardDto {

    private Integer boardNum; // 게시글 번호
    private String userId;   // 작성자
    private String wDate; // 작성일자
    private String title; // 제목
    private String content; // 내용
    private int hitNum; // 조회수

}