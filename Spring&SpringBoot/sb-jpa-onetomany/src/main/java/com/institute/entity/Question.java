package com.institute.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String question;
	private String description;
	private Date postdets;
	// mappedBy: is use to mapped with the foreign key created inside another table. Mostly use for bi-direction
	//cascade: this property is use to perform the deletion or updation operations on the related tables.
	/*@OneToMany(mappedBy = "qid", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	incase of restAPI no need to specify defult fect type defult will work when use ApplicationContext class then specify it*/
	@OneToMany(mappedBy = "qid", cascade = CascadeType.ALL)
	private List<Answer> answers;
}
