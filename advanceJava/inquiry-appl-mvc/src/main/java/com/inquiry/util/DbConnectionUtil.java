package com.inquiry.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.inquiry.bean.Inquiry;


public final class DbConnectionUtil {
	private static final String drivername="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/fsd27sept";
	private static final String username="root";
	private static final String password="root";
	
	public static final Connection getConection() {
		try {
			Class.forName(drivername);
			Connection con = DriverManager.getConnection(url,username,password);
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static final void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public final static List<String> validateInquiery(Inquiry inquiry) {
		List<String> errors = new ArrayList<String>();
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Inquiry>> constraintViolations = validator.validate(inquiry);
		if (constraintViolations.size() > 0) {
			for (ConstraintViolation<Inquiry> violation : constraintViolations) {
				errors.add(violation.getMessage());
			}
		}
		return errors;
	}
}
