import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicRecords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int stud_id = scan.nextInt();
		
		System.out.println("Enter Name : ");
		String stud_name = scan.next();
		
		System.out.println("Enter Contact Number : ");
		String stud_contact = scan.next();

		System.out.println("Enter City : ");
		String stud_city = scan.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			
			PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
			stmt.setInt(1, stud_id);
			stmt.setString(2, stud_name);
			stmt.setString(3, stud_contact);
			stmt.setString(4, stud_city);
			
			int count = stmt.executeUpdate();
			
			stmt.close();
			scan.close();
			con.close();
			System.out.println("Total row inserted is : "+count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
