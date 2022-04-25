import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validate-me")
public class UserAuth extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("uname");
		String pass = request.getParameter("upass");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement pstmt = con.prepareStatement("select * from employee where emp_email=? and emp_pwd=?");
			pstmt.setString(1,username);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("uid", rs.getInt("emp_id"));
				session.setAttribute("uname", rs.getString("emp_name"));
				session.setAttribute("email", rs.getString("emp_email"));
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
