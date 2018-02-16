package com.as.sample.SpringBootApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.tagext.IterationTag;

import org.springframework.stereotype.Service;

import com.as.sample.SpringBootApp.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "meet", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "meet", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "meet", "Learn Hibernate", new Date(),
                false));
	}
	
	public List<Todo> retriveTodos(String user){
		List<Todo> filteredOut = new ArrayList<Todo>();
		
		for (Todo todo: todos) {
			if(todo.getUser().equals(user)) {
				filteredOut.add(todo);
			}
		}
		return filteredOut;
	}
	
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}
	
	public void delete(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while(iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public Todo retriveTodo(int id){
		for (Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}
}
