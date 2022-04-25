package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.institute.bean.Student;

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-config.xml");
    	
        Student st1 = actx.getBean("stud", Student.class);
        Student st2 = actx.getBean("stud", Student.class);
        Student st3 = actx.getBean("stud", Student.class);
        Student st4 = actx.getBean("stud", Student.class);
    }
}
