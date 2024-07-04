package com.example.project_2.controller;

import com.example.project_2.model.BoardModel;
import com.example.project_2.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board")
@Slf4j
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public String home(){

        return "board/home.jsp";
    }

    @PostMapping("/insertTest")
    public void getInsert(BoardModel boardModel){
        System.out.println("boardModel = " + boardModel);
        boardService.insertTest(boardModel);

    }
}
