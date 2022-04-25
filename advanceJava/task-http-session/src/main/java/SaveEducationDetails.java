import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/save-education-details")
public class SaveEducationDetails extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String hdegree = request.getParameter("hdegree");
		String pyear = request.getParameter("pyear");
		String clg = request.getParameter("clg");
		String percentage = request.getParameter("percentage");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root","root");
			PreparedStatement pstmt = con.prepareStatement("insert into user_edu_details values(0,?,?,?,?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, hdegree);
			pstmt.setString(3, pyear);
			pstmt.setString(4, clg);
			pstmt.setString(5, percentage);
			int count = pstmt.executeUpdate();
			con.close();
			if(count == 1) {
				response.sendRedirect(".jsp?code=201");
			}else {
				response.sendRedirect("education-details.jsp?code=403");
			}
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("education-details.jsp?code=500");
		}
	}
}