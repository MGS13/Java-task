package com.todo.todo.controller;

import com.todo.todo.TodoApplication;
import com.todo.todo.model.Options;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {
    // @Autowired
    // OptionsService service;

    @GetMapping("/app/add")
    public String addTask(Model model) {
        // model.addAttribute("todo", new Options());
        model.addAttribute("opt", new Options());
        return "add-todo";
    }
}