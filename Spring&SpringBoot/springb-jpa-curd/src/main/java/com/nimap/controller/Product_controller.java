package com.nimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.nimap.repository.ProductRepo;

@RestController
@RequestMapping("/api")
public class Product_controller {
	@Autowired
	private ProductRepo repo;
	
	@PostMapping("/products") 
	public Product save(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@DeleteMapping("/products/{id}") 
	public String delete(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Product Deleted Successfully";
	}
	@GetMapping("/all-products")
	 public List<Product> getAll(){
		 return repo.findAll();
	 }
	@GetMapping("/products/{id}")	
	 public Product getProduct(@RequestParam("id") int id){
		 return repo.getById(id);
	 }	
	
	@PostMapping("/save-all-roducts")
	public List<Product> saveAll(@RequestBody List<Product> product) {
		 return repo.saveAll(product); 
	}
	
//	@PostMapping("/save-all-products")
//	public String saveAllProduct(@RequestBody List<Product> product){
//		repo.saveAll(product);
//		return product.size()+"Product inserted successfully";
//	}
	
	@PutMapping("/products/{pid}")
	public Product updateProduct(@PathVariable("pid") int id,@RequestBody Product product) {
		 return repo.findById(id).map(prod -> {
			 	product.setTitle(product.getTitle());
			 	product.setPrice(product.getPrice());
	            product.setQuantity(product.getQuantity());
	            product.setCid(product.getCid());
	            return repo.save(product);
	        }).get();	 
		 
	}
	
}
