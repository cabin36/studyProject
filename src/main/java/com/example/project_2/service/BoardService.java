package com.example.project_2.service;

import com.example.project_2.Mapper.BoardMapper;
import com.example.project_2.model.BoardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;
    public void insertTest(BoardModel boardModel) {
        boardMapper.insertTest(boardModel);
    }
}
