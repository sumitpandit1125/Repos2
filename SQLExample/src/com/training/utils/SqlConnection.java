package com.training.utils;


import java.sql.*;
import java.util.Properties;

import java.io.InputStream;

public class SqlConnection {
	
	public static Connection getOracleConnection(){
		Connection con = null;
		
		try {
			
			Properties prop = new Properties();
			
			//FileInputStream inStream = 
			//		new FileInputStream(new File("DbConnection.properties"));
			
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
			
			prop.load(inStream);
			
			Class.forName(prop.getProperty("db.className"));
			
			con = DriverManager.getConnection(
					prop.getProperty("db.url"),
					prop.getProperty("db.userName"),
					prop.getProperty("db.passWord")					
					);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
		return con;
	}

}
