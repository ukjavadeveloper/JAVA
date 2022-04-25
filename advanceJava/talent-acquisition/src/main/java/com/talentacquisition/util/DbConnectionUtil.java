package com.talentacquisition.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionUtil {
	private static final String drivername="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/talent_acquisition";
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
}
