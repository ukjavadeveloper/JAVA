package edu.institute.controller;	

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/user/welcome1")
	public String welcomeController() {
		return "Welcome User....";
	}
}
