package com.codersingh.youtubetodolist.repo;

import com.codersingh.youtubetodolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
