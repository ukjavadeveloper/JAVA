package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr/")
public class HrController {
	@GetMapping("/home")
	public String hrHome() {
		return "This is HR Home page";
	}
}
