package com.practice.springboot.myfirstwebapp.todo;

import java.util.List;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("usmanmuh");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	@RequestMapping(value="add-todos", method = RequestMethod.GET)
	public String showTodos() {
		return "todo";
	}
	
	@RequestMapping(value="add-todos", method = RequestMethod.POST)
	public String addTodos(@RequestParam String description, ModelMap model) {
		todoService.addTodo((String)model.get("name"), description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}
