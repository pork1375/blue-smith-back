package com.example.blueSmith.board.controller;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    final BoardService boardService;

    @RequestMapping("/board")
    public String boardTest() {
        return "Board Test";
    }

    @GetMapping("/board/dtoTest")
    public String boardDto() {
        BoardDto boardDto = new BoardDto();
        String uid = boardDto.getUserId();
        String wDate = boardDto.getWDate();
        String title = boardDto.getTitle();
        String content = boardDto.getContent();

        return uid + " " + wDate + " " + title + " " + content;


    }

}
