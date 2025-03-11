package com.jtp.jutopia.web.board.impl;

import com.jtp.jutopia.web.board.dao.boardDAO;
import com.jtp.jutopia.web.board.service.boardService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("boardService")
public class boardServiceImpl implements boardService {

    @Resource(name = "boardDAO")
    private boardDAO boardDao;

    @Override
    public void getBoardList() throws Exception{
    };
}
