package com.example.blueSmith.board.controller;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class BoardController {

    final BoardService boardService;

    @GetMapping("/board")
    public String allList() { // 게시판 글 전체목록 가져오기 테스트
        String result = boardService.getBoardList();
        return result;
    }

    @GetMapping("/board/writing")
    public void write() {

    }

}
