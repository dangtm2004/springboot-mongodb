package com.mongodb.backend.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.backend.model.TodoDTO;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {
	
	@Query("{'name': ?0}") // ?0 -> pass the 0 index
	Optional<TodoDTO> findByTodo(String todo);
}
