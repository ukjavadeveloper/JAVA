package com.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-config.xml");
    	Student student = actx.getBean("st", Student.class); // to get the Object from Spring Container
    	Hr h = actx.getBean("hr", Hr.class);
    	Teacher tech = actx.getBean("tech", Teacher.class);
    	student.print();
        System.out.println( "Application Closed..." );
    }
}
