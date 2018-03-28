package com.assignment.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.todoapp.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}