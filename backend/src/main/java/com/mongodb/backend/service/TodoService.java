package com.mongodb.backend.service;

import java.util.List;

import javax.validation.ConstraintViolationException;

import com.mongodb.backend.exception.TodoCollectionException;
import com.mongodb.backend.model.TodoDTO;

public interface TodoService {
	public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;
	
	public List<TodoDTO> getAllTodos();
	
	public TodoDTO getSingleTodo(String id) throws TodoCollectionException;
	
	public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;
	
	public void deleteTodoById(String id) throws TodoCollectionException;
}
