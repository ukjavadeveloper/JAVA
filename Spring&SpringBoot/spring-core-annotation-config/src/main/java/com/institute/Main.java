package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.institute.bean.Student;
import com.institute.config.SpringConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student std = ctx.getBean("std", Student.class);
		System.out.println("Name : " + std.getName());
	}
}
