package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Employee;
import com.institute.bean.Product;

public class App {
    public static void main( String[] args ){
    	ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-si.xml","spring-core-ci-config.xml");
    	
    	System.out.println("=====================SI====================");
    	
    	Product p = actx.getBean("product",Product.class);
    	System.out.println("Id : " + p.getId());
    	System.out.println("Name : " + p.getName());
    	System.out.println("Price : " + p.getPrice());
    	System.out.println("Model : " + p.getModel());
    	System.out.println("Comment : " + p.getComment());
    	System.out.println("Ratings : " + p.getRatings());
    	
    	System.out.println("======================CI====================");
    	Employee emp = actx.getBean("emp",Employee.class);
    	System.out.println("Employee Id : " + emp.getId());
    	System.out.println("Employee Name : " + emp.getName());
    	System.out.println("Employee Salary : " + emp.getSalary());
    	System.out.println("Employee Contact : " + emp.getContact());
    	for(String cont: emp.getContact()){
    		System.out.println(cont);
    	}
    	System.out.println("Employee Skills : " + emp.getSkills());
    	System.out.println("Employee Address : " + emp.getAddress());
    	System.out.println("Employee Companies : " + emp.getCompanies());
    }
}
