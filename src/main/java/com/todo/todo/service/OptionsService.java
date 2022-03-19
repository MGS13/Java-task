package com.todo.todo.service;

import com.todo.todo.model.Options;
import com.todo.todo.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class OptionsService {
    TaskRepository repo;

    public Options createTask(Options o) {
        return repo.save(o);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}