import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from studentinfo");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("contact")+"\t");
				System.out.print(rs.getString("city")+"\n");
			}
			
			con.close();
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
