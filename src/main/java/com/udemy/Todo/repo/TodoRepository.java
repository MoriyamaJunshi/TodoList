package com.udemy.Todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.Todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
