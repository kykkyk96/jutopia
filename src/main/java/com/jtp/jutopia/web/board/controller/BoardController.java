package com.jtp.jutopia.web.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {


//    @Autowired
//    private BoardService boardService;

    @RequestMapping(value="board/boardList")
    public String boardList() throws Exception{

        String test = "hello";
        return "board/boardList";
    }

    @GetMapping(value= "board/boardInfo")
    public String boardInfo() throws Exception{

//        String test = "this is boardInfo!";
//        return test;
        return "board/boardInfo";
    }
}
