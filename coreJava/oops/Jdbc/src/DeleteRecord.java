import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
		PreparedStatement stmt = con.prepareStatement("Delete from studentinfo where id=?");
		stmt.setInt(1, 7);
		int count = stmt.executeUpdate();
		con.close();
		stmt.close();
		System.out.println("Total row Deleted : "+count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
