package com.restaurant.utils;



import java.sql.*;


public class SqlConnection {
	
	public static Connection getOracleConnection(){
		Connection con = null;
		
		try {
			
			/*Properties prop = new Properties();
			
			FileInputStream inStream = 
					new FileInputStream(new File("DbConnection.properties"));
			
			prop.load(inStream);
			*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"restaurant",
					"restaurant"					
					);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
		return con;
	}

}
