package com.todo.todo.controller;

import com.todo.todo.TodoApplication;
import com.todo.todo.model.Options;
import com.todo.todo.service.OptionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataController {
    @Autowired
    OptionsService service;

    @RequestMapping(value = "/app/show", method = {RequestMethod.GET, RequestMethod.POST})
    public String addTask(Model model) {
        model.addAttribute("opt", new Options());
        return "show-todo";
    }
}