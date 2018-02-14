package com.as.sample.SpringBootApp.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.sample.SpringBootApp.model.Todo;
import com.as.sample.SpringBootApp.service.LoginService;
import com.as.sample.SpringBootApp.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		String name=getLoggedInUserName(model);
		model.put("todos", service.retriveTodos(name));
		return "list-todos";
	}

	private String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		model.addAttribute("todo", new Todo(0, getLoggedInUserName(model), "", new Date(), false));
		return "todo";
    }	
	
	@RequestMapping(value="/add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		service.addTodo(getLoggedInUserName(model), todo.getDesc(), new Date(), false);
		System.out.println(todo.getDesc());
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method= RequestMethod.GET)
	public String addTodo(@RequestParam int id) {
		service.delete(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/update-todo", method= RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo=service.retriveTodo(id);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="/update-todo", method= RequestMethod.POST)
	public String UpdateTodo( ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		todo.setUser(getLoggedInUserName(model));
		service.updateTodo(todo);
		return "redirect:/list-todos";
		
	}
	
	
}
