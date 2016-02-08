package com.training;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class NewConnection {
	
	
	
	public static Connection getConnection(){
		
		Connection con = null;
		
		try {
		
			Properties prop = new Properties();
			FileInputStream inStream = new FileInputStream(new File("DbConnection.properties"));
			prop.load(inStream);
			
			Class.forName(prop.getProperty("db.className"));
			
			/*System.out.println(prop.getProperty("db.url")+ 
					prop.getProperty("db.userName")+ 
					prop.getProperty("db.passWord"));
			
			*/
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
