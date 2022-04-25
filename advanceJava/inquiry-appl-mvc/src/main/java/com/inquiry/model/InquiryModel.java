package com.inquiry.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.inquiry.bean.Inquiry;
import com.inquiry.util.DbConnectionUtil;
public class InquiryModel {
		
	public boolean save(Inquiry inquiry) {
		boolean result =  false;
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into inquiry values(0,?,?,?,?,?,?)");
			pstmt.setString(1, inquiry.getName());
			pstmt.setString(2, inquiry.getEmail());
			pstmt.setString(3, inquiry.getContact());
			pstmt.setString(4, inquiry.getCity());
			pstmt.setString(5, inquiry.getInqFor());
			pstmt.setDate(6, inquiry.getInqdate());
			int count= pstmt.executeUpdate();
			result = count > 0;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		DbConnectionUtil.closeConnection(con);
		return result;
	}
	public List<Inquiry> getAll(){
		List<Inquiry> list = new ArrayList<>();
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from inquiry");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Inquiry inq = new Inquiry();
				inq.setId(rs.getInt("id"));
				inq.setName(rs.getString("name"));
				inq.setEmail(rs.getString("email"));
				inq.setContact(rs.getString("contact"));
				inq.setCity(rs.getString("city"));
				inq.setInqFor(rs.getString("inqfor"));
				inq.setInqdate(rs.getDate("inqdate"));
				list.add(inq);
			}		
		}catch(Exception e) {	
			e.printStackTrace();
		}
		DbConnectionUtil.closeConnection(con);
		return list;
	}
	public Inquiry editById(int id) {
		Inquiry inq = new Inquiry();
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from phbook where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				inq.setId(rs.getInt("id"));
				inq.setName(rs.getString("name"));
				inq.setContact(rs.getString("contact"));
				inq.setCity("city");
				inq.setInqFor("inqfor");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		DbConnectionUtil.closeConnection(con);
		return inq;
	}
	
	public boolean updateInquiry(Inquiry inquiry) {
			boolean result = false;
			Connection con = DbConnectionUtil.getConection();
			try {
				PreparedStatement pstmt = con.prepareStatement("update inquiry set name=?, email=?, contact=?, city=?, inqdate=? where id=?");
				pstmt.setString(1, inquiry.getName());
				pstmt.setString(2, inquiry.getEmail());
				pstmt.setString(3, inquiry.getContact());
				pstmt.setString(4, inquiry.getCity());
				pstmt.setDate(5, inquiry.getInqdate());
			//	pstmt.setString(5, inquiry.getInqFor());
				pstmt.setInt(6, inquiry.getId());
				
				int count= pstmt.executeUpdate();
				result = count > 0;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			DbConnectionUtil.closeConnection(con);
			return result;
	}
	public boolean deleteInquiry(int id) {
		boolean result = false;
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from inquiry where id=?");
			pstmt.setInt(1, id);
			int count=pstmt.executeUpdate();
			result = count > 0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
