package edu.institute.bean;

public class Course {
	private int id;
	private String title;
	private String Duration;
	private double fees;
	public Course(int id, String title, String duration, double fees) {
		this.id = id;
		this.title = title;
		Duration = duration;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
}
