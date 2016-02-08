package com.training.example;

import java.sql.*;
import com.training.utils.SqlConnection;



public class CallableExample {
		
	public static void main(String[] args) {
		
		
		try {
			
			Connection con = SqlConnection.getOracleConnection();
			
			CallableStatement stmt = con.prepareCall("call updatePhoneNumber(?,?,?)");
			
			stmt.setInt(1,103);
			stmt.setLong(2, 00000L);
			stmt.registerOutParameter(3, java.sql.Types.NUMERIC);
			
			stmt.execute();
			System.out.println("Thanks for updating phone number\n"+stmt.getInt(3) +" rows updated");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
