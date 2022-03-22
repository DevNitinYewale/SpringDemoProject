package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/")
	public String home1() {

		return "welcome to home page";
	}

	@GetMapping("/home")
	public String home() {

		return "welcome my home";
	}
}
