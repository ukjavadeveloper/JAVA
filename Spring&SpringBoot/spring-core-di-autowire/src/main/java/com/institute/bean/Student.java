package com.institute.bean;

public class Student {
	private int id;
	private String name;
	private Address address;//dependency
	private EducationDetails higherEdu;//dependency
	public Student() {
	}
	public Student(int id, String name, Address address, EducationDetails higherEdu) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.higherEdu = higherEdu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EducationDetails getHigherEdu() {
		return higherEdu;
	}
	public void setHigherEdu(EducationDetails higherEdu) {
		this.higherEdu = higherEdu;
	}
}
