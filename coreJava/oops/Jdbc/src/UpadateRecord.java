import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpadateRecord {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");		
		PreparedStatement stmt = con.prepareStatement("update studentinfo set contact=? where id=?");
		stmt.setString(1, "1111122222");
		stmt.setInt(2, 9);
		int count = stmt.executeUpdate();
	
		con.close();
		stmt.close();
		System.out.println("Total row updated : "+count);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
