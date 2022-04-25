import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user-auth")
public class UserLogin extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("uname");
		String pass = request.getParameter("pass");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement pstmt = con.prepareStatement("select * from user_details where email=? and password=?");
			pstmt.setString(1,email);
			pstmt.setString(2,pass);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("id", rs.getInt("id"));
				session.setAttribute("name", rs.getString("name"));
				session.setAttribute("email", rs.getString("email"));
				session.setAttribute("contact", rs.getString("contact"));
				session.setAttribute("city", rs.getString("city"));
				response.sendRedirect("home.jsp");
			}else {
				response.sendRedirect("login.jsp?code=403");
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("login.jsp?code=500");
		}
	}
}