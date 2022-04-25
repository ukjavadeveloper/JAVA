package com.institute.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String[] contact;	
	private Map<String,String> address;
	private Set<String> skills;
	private List<String> companies;

	public Employee(int id, String name, double salary, String[] contact, Map<String, String> address,
			Set<String> skills, List<String> companies) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact = contact;
		this.address = address;
		this.skills = skills;
		this.companies = companies;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String[] getContact() {
		return contact;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public List<String> getCompanies() {
		return companies;
	}
}
