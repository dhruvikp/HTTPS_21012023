package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet/me")
	public String greet() {
		return "Hello world! This is HTTPS example";
	}
}
