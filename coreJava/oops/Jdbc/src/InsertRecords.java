import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertRecords {
	public static void main(String[] args) {

		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			
			//create statement
			PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(7,'xyz','9313167631','pune')");
			
			//Execute Statement
			int count = stmt.executeUpdate();
			
			//close connection
			stmt.close();
			con.close();
			
			System.out.println("Total row inserted is : "+count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
