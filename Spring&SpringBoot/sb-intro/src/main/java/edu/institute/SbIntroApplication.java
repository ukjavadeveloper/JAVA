	package edu.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SbIntroApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SbIntroApplication.class, args); // starts spring boot application.
	}

}
