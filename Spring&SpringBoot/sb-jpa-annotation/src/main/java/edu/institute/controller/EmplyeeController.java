package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Employee;
import edu.institute.repository.EmployeeRepo;

@RestController
public class EmplyeeController {

	@Autowired
	EmployeeRepo empRepo; 
	
	@PostMapping("employee/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	@DeleteMapping("employee/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empRepo.deleteById(id);
		return "Employee info deleted successfully";
	}
	@GetMapping("employee/get-all")
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	@PutMapping("employee/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);		
	}
}
