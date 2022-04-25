package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@GetMapping("/admin/welcome1")
	public String adminWelcome() {
		return "welcome Admin......";
	}
}
