import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register-user")
public class RegisterUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement pstmt = con.prepareStatement("insert into user_details values(0,?,?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, pass);
			pstmt.setString(4, contact);
			pstmt.setString(5, city);
			int count = pstmt.executeUpdate();
			con.close();
			//System.out.println(count);
			if(count == 1) {
				response.sendRedirect("login.jsp?code=201");
			}else {
				response.sendRedirect("register.jsp?code=403");
			}
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("register.jsp?code=500");
		}
	}
}
