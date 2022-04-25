package com.institute.bean;

public class Student {
	private String name;
	public Student(String name) {
		this.name = name;
		System.out.println("Student class : " + name);
	}
	public String getName() {
		return name;
	}
	
}
