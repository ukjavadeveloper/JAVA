package com.institute.spring_core_introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ApplicationContext actx = new ClassPathXmlApplicationContext("spring-core-config.xml");
        System.out.println( "Application Closed..." );
    }
}
