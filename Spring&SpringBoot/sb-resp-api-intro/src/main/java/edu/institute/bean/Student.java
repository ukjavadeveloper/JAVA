package edu.institute.bean;

public class Student {
	private int id;
	private String name;
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
	public String[] getContact() {
		return contact;
	}
	public void setContact(String[] contact) {
		this.contact = contact;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	private String[] contact;
	private Course course;
}
