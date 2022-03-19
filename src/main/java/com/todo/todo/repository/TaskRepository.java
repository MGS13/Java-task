package com.todo.todo.repository;

import com.todo.todo.model.Options;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Options, Long> {
    
}