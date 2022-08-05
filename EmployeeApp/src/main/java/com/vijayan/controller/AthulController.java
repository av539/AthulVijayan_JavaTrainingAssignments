package com.vijayan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AthulController 
{
	@GetMapping("/")
	public String display()
	{
		return "Welcome to the world of Spring Boot!";
	}
}
