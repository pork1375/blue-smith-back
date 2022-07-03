package com.example.blueSmith.board.service;

import com.example.blueSmith.board.dto.BoardDto;
import com.example.blueSmith.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final private BoardMapper boardMapper;

    @Override
    public String getBoardList() {
        List<BoardDto> allList = boardMapper.getBoardList();
        String line ="";

        for (BoardDto tmp: allList) {
            String boardNum = String.valueOf(tmp.getBoardNum());
            String user = tmp.getUserId();
            String date = tmp.getWDate();
            String title = tmp.getTitle();
            String content = tmp.getContent();
            String hit = String.valueOf(tmp.getHitNum());

            line = line + "<br>" + boardNum +" " + user +" "+ date +" " + title +" " + content + " " +hit;
        }
        return line;
    }
}
