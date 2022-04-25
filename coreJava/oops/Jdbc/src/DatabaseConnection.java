import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");//Register Driver
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");//create connection	
			
			
			
			con.close();//close connection
			
			System.out.println("Databse Connection Successfully...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
