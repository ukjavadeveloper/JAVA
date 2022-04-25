package jdbc_task;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class Employees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int emp_id = scan.nextInt();
		
		System.out.println("Enter Name : ");
		String emp_name = scan.next();
		
		System.out.println("Enter EmailId : ");
		String emp_email = scan.next();
		
		System.out.println("Enter Password : ");
		String emp_pwd = scan.next();	
		
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("resoruces/db.properties"));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("username");
			String pwd = properties.getProperty("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pwd);	
			
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?)");
			stmt.setInt(1, emp_id);
			stmt.setString(2, emp_name);
			stmt.setString(3, emp_email);
			stmt.setString(4, emp_pwd);
			
			int count = stmt.executeUpdate();
			
			con.close();
			scan.close();
			stmt.close();
			System.out.println("Total Row Inserted is : "+count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
