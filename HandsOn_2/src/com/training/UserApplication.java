package com.training;

import java.sql.*;

public class UserApplication {
	
	public static void main(String[] args) {
		
		Connection con = NewConnection.getConnection();
		String sql = "select * from users where userName = ? AND passWord = ?";
		PreparedStatement stmt;
		
		try {
			
			
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "sumit");
			stmt.setString(2, "sumit");
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				System.out.println("Role :- "+rs.getString("role"));
			}
			else{
				System.out.println("Invalid username and password combination");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
