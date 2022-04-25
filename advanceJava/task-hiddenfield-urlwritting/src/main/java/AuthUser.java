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
@WebServlet("/auth-user")
public class AuthUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		//String statuscode = "2";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from user_info where email=? and password=?");
			stmt.setString(1, email);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				//System.out.print(rs.getString("name"));
				//statuscode = "1";
				request.setAttribute("name", rs.getString("name"));
				RequestDispatcher dis = request.getRequestDispatcher("home.jsp?code=");
				dis.forward(request, response);
			}else {
				response.sendRedirect("sign-in.jsp?code=403");
			}
			con.close();
			
		}catch(Exception e) {
			//statuscode = "3";
			e.printStackTrace();
			response.sendRedirect("sign-in.jsp?code=500");
		}
	}
}
