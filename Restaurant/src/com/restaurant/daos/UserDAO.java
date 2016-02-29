package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.restaurant.entity.Users;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;

public class UserDAO implements DAO<Users> {
	
	private Connection con;
	
	
	
	public UserDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(Users e) {
		String sql = "insert into User values (?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getUserId());
			pstmt.setString(2, e.getPassword());
			pstmt.setString(3, e.getRole());
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Users find(int userId) {
		String sql = "select * from User where userId = ?";
		PreparedStatement pstmt;
		Users emp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				emp = getUsers(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return emp;
		
	}

	@Override
	public List<Users> findAll() {
		String sql = "select * from Users";
		PreparedStatement pstmt;
		Users emp = null;
		List<Users> empList = new ArrayList<Users>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				emp = getUsers(rs);
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from User where userId = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(Users e){
		String sql = "update users set password = ?, role = ?  where userId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, e.getPassword());
			pstmt.setString(2, e.getRole());
			pstmt.setInt(3, e.getUserId());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	public boolean validateUser(Users us){
		
		Users newUs = find(us.getUserId());
		if(newUs!=null){
			if(newUs.getPassword().equals(us.getPassword()) && newUs.getRole().equals(us.getRole()))
				return true;
		}
		
		return false;
	}
	
	private Users getUsers(ResultSet rs){
		
		
		Users emp = null;
		try {
			emp = new Users(rs.getInt("userId"), rs.getString("password"), rs.getString("role"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	


}
