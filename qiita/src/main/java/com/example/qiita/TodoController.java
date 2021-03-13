package com.example.qiita;

import com.example.qiita.dao.TodoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/top")
    public String top(Model model){
        List<TodoEntity> todoEntityList = todoService.findAllTodo();
        model.addAttribute("todoList",todoEntityList);
        return "top";
    }
}
