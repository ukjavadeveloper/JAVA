import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectRecordByWhereClause {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("resoruces/db.properties"));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("username");
			String pwd = properties.getProperty("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement stmt = con.prepareStatement("select * from studentinfo where city=? and id=?");
			stmt.setString(1,"nashik");
			stmt.setInt(2, 5);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("contact")+"\t");
				System.out.print(rs.getString("city")+ "\n");
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
