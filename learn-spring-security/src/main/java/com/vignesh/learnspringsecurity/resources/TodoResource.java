package com.vignesh.learnspringsecurity.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

	private static final List<Todo> TODOS_LIST = List.of(new Todo("Vignesh", "complete Spring-boot"),
			new Todo("Vignesh", "Complete Learning React"));

	@GetMapping("todos")
	public List<Todo> retriveAllTodos() {
		return TODOS_LIST;

	}

	@GetMapping("/users/{username}/todos")
	public Todo retriveTodosForSpectfiedUser(@PathVariable String username) {
		return TODOS_LIST.get(0);

	}
	
	
	@PostMapping("/users/{username}/todos")
	public void createTodosForSpectfiedUser(@PathVariable String username, @RequestBody Todo todo) {
		TODOS_LIST.add(todo);

	}
}

record Todo(String username, String description) {
};