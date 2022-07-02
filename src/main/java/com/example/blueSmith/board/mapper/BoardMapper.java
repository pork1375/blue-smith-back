package com.example.blueSmith.board.mapper;

import com.example.blueSmith.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardMapper {
    BoardDto boardDto();

}
