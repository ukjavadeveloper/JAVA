package edu.institute.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_details")
public class Course {
	@Id
	private int id;
}
