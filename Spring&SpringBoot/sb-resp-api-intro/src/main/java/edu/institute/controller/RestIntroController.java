package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.bean.Course;
import edu.institute.bean.Employee;
import edu.institute.bean.Student;

@RestController
public class RestIntroController {
	@GetMapping("/welcome/get")
	public String welcomeGetApi() {
		return "Welcome to first Http GET REST API....";
	}
	
	@PostMapping("/welcome/post")
	public String welcomePostApi() {
		return "Welcome to first Http POST REST API....";
	}
	
	@GetMapping("/employee/get")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(111);
		emp.setName("Xyz");
		emp.setContact("2343425243");
		return emp;
	}
	@GetMapping("/student/get")
	public Student getStudent() {
		Student stud = new Student();
		stud.setId(1);
		stud.setName("pqr");
		stud.setContact(new String[]{"4343212132,9898989898"});
		stud.setCourse(new Course(1,"Fullstack Java","4-Month",25000.56) );
		return stud;
	}
}
