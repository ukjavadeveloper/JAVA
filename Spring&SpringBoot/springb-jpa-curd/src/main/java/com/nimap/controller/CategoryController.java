package com.nimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.entity.Category;
import com.nimap.entity.Product;
import com.nimap.repository.CategoryRepo;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryRepo repo;

	@PostMapping("/categories") 
	public String createCategory(@RequestBody Category category) {
		repo.save(category);
		return "Category inserted Successfully...";
	}
	
	@DeleteMapping("/categories/{id}") 
	public String deleteCategory(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Category Deleted Successfully";
	}
	
	@GetMapping("/all-categories")
	 public List<Category> getAllCategory(){
		 return repo.findAll();
	 }
	
	@GetMapping("/categories/{id}")
	 public Category getCategory(@RequestParam("id") int id){
		return  repo.findById(id).get();
	 }
	
	@PutMapping("/categories/{cid}")
	public Category updateCategory(@PathVariable("cid") int id,@RequestBody Category category) {
		return repo.findById(id).map(cat -> {
			category.setName(category.getName());
	            return repo.save(category);
	        }).orElseThrow();
	}	
}
