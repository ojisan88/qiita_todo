package com.example.qiita;

import com.example.qiita.dao.TodoEntity;
import com.example.qiita.dao.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<TodoEntity> findAllTodo(){

        return todoRepository.findAll();
    }
}
