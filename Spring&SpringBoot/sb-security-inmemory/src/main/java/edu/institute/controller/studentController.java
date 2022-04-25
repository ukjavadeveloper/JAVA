package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/")
public class studentController {
	@GetMapping("/home")
	public String adminHome() {
		return "This is Student Home Page";
	}
}
