package jdbc_task;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class ValidateUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Email Id : ");
		String email = scan.next();
		System.out.println("Enter your Password : ");
		String pwd = scan.next();
		
		try{
			Properties properties = new Properties();
			properties.load(new FileInputStream("resoruces/db.properties"));
			String driver =  properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("username");
			String pass = properties.getProperty("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement stmt = con.prepareStatement("select * from employee where emp_email=? and emp_pwd=? ");
			stmt.setString(1, email);
			stmt.setString(2, pwd);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				System.out.println("Valid User");
			}else {
				System.out.println("Invalid User...");
			}
		
			con.close();
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
