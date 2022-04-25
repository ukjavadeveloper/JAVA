package com.institute.spring_core_introduc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-config.xml");
    	Student st = actx.getBean("stud",Student.class);
    	st.print();
    	
    	Hr h = actx.getBean("hr",Hr.class);
    	Teacher tech = actx.getBean("tech",Teacher.class);
   
        System.out.println( "Application Closed..." );
    }
}
