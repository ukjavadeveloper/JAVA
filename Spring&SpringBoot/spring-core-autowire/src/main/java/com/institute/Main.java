package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-autowire.xml");
		Employee emp = actx.getBean("emp1",Employee.class);
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Address : " + emp.getAdd().getCity());
		System.out.println("Experince : " + emp.getExpe().getCompanyname());	
		
	}
}
