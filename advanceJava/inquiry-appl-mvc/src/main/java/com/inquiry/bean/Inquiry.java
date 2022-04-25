package com.inquiry.bean;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Inquiry {
	private int id;
	@NotEmpty(message = "Name Must not be empty or null")
	@Size(min = 2, max = 30, message = "Name Must be of 2-30 chars...")
	private String name;
	@NotEmpty(message = "City Must not be empty or null")
	private String city;
	@NotEmpty(message = "Contact Number Must not be null")
	@Pattern(regexp = "[0-9]{10}", message = "Contact number must be of 10 digits")
	private String contact;
	@NotEmpty(message = "Email Must not be empty or null")
	private String email;
	private String inqFor;
	private Date inqdate;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInqFor() {
		return inqFor;
	}
	public void setInqFor(String inqFor) {
		this.inqFor = inqFor;
	}
	public Date getInqdate() {
		return inqdate;
	}
	public void setInqdate(Date inqdate) {
		this.inqdate = inqdate;
	}

}
