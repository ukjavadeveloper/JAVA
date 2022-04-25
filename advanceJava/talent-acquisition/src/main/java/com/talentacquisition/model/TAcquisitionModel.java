package com.talentacquisition.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.talentacquisition.bean.TAcquisition;
import com.talentacquisition.util.DbConnectionUtil;

public class TAcquisitionModel {
	
	
	public boolean save(TAcquisition taq) {
		boolean result = false;
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into registration values(0,?,?,?)");
			pstmt.setString(1, taq.getName());
			pstmt.setString(2, taq.getEmail());
			pstmt.setString(3, taq.getPassword());
			int count= pstmt.executeUpdate();
			result = count > 0;

		}catch(Exception e) {
			e.printStackTrace();
		}
		DbConnectionUtil.closeConnection(con);
		return result;
	}
	public TAcquisition loginAction(TAcquisition taq) {
		Connection con = DbConnectionUtil.getConection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from registration where password=? and email=?");
			pstmt.setString(1, taq.getPassword());
			pstmt.setString(2, taq.getEmail());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				taq.setId(rs.getInt("id"));
				taq.setName(rs.getString("user_name"));
				taq.setEmail(rs.getString("email"));
			}else {
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		DbConnectionUtil.closeConnection(con);
		return taq;
	}
	
}
