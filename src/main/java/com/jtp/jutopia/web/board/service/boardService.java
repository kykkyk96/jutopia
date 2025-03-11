package com.jtp.jutopia.web.board.service;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface boardService {
    public void getBoardList() throws Exception;
}
