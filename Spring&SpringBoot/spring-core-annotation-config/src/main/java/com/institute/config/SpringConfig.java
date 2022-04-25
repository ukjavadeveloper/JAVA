package com.institute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.institute.bean.Student;

@Configuration
@ComponentScan({"com.institute"})
public class SpringConfig {
	@Bean("std") 
	public Student getStudent() {
		Student st = new Student("Abcd");
		return st;
	}
}
