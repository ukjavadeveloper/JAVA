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

import edu.institute.bean.Employee;
import edu.institute.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/employee/save")
	public String saveEmployee(@RequestBody Employee emp) {
		int result= empRepo.saveEmployee(emp);
		return result>0 ? "Date inserted Successfully" :"Error....."; 
	}
	@DeleteMapping("/employee/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		int result= empRepo.delete(id);
		return result>0 ? "Employee Deleted Successfully...":"Error in Employee Deletion...";
	}
	@GetMapping("/employee/get-all")
	public List<Employee> getAllEmployee() {
		return empRepo.getAll();
	}
	@PutMapping("/employee/update")
	public String updateEmployee(@RequestBody Employee emp) {
		int result = empRepo.updateEmployee(emp);
		return result>0 ? "updated successfully..." :"Error in Employee updation...";
	}
}
