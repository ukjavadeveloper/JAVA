package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Student;

public class SpringDiTest {
	public static void main(String[] args) {
		ApplicationContext actx = new ClassPathXmlApplicationContext("spring-di.xml");
		Student stud = actx.getBean("stud",Student.class);
		System.out.println("Id : " + stud.getId());
		System.out.println("Name : " + stud.getName());
		System.out.println("Address Details : ");
		System.out.println("City : " + stud.getAddress().getCity());
		System.out.println("State : " + stud.getAddress().getState());
		System.out.println("Education Details : ");
		System.out.println("College Name : " + stud.getHigherEdu().getInstituteName());
		System.out.println("Passing Year :" + stud.getHigherEdu().getPassingYear());
		System.out.println("Percent : " + stud.getHigherEdu().getPercent());
	}
}
