package com.example.blueSmith.board.mapper;

import com.example.blueSmith.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardMapper {
    List<BoardDto> getBoardList();

}
