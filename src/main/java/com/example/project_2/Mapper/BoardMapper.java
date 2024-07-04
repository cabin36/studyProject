package com.example.project_2.Mapper;

import com.example.project_2.model.BoardModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BoardMapper {


    void insertTest(BoardModel boardModel);
}
