package com.todo.service;

import com.todo.model.Options;
import com.todo.repository.TaskRepository;

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