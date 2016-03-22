package com.clinicallab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.clinicallab.entity.Role;
import com.clinicallab.entity.Users;
import com.clinicallab.ifaces.DAO;
import com.clinicallab.utils.SqlConnection;


public class UsersDAO implements DAO<Users> {
	
	private Connection con;
	
	public UsersDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}


	@Override
	public int add(Users t) {
		String sql = "insert into Users values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getId());
			pstmt.setString(2,t.getUserName());
			pstmt.setString(3,t.getPassWord());
			pstmt.setString(4,t.getRole().name());
			pstmt.setString(5,t.getStatus());
			pstmt.setString(6,t.getLab());
			return pstmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Users find(int id) {
		String sql = "select * from Users where id = ?";
		PreparedStatement pstmt;
		Users usr = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				usr = getUsers(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return usr;
	}

	@Override
	public List<Users> findAll() {
		String sql = "select * from Users";
		PreparedStatement pstmt;
		Users usr = new Users();
		ArrayList<Users> usrList = new ArrayList<Users>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				usr = getUsers(rs);
				usrList.add(usr);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usrList;
	}

	@Override
	public int update(Users id) {
		String sql = "update Users set passWord = ? , role = ? , status = ? , lab = ? where userName = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(5, id.getUserName());
			pstmt.setString(1, id.getPassWord());
			pstmt.setString(2, id.getRole().name());
			pstmt.setString(3, id.getStatus());
			pstmt.setString(4, id.getLab());
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from Users where id = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	private Users getUsers(ResultSet rs){
		Users usr = new Users();
		try {
			usr.setId(rs.getInt("id"));
			usr.setUserName(rs.getString("userName"));
			usr.setPassWord(rs.getString("passWord"));
			usr.setRole(Role.valueOf(rs.getString("role")));
			usr.setStatus(rs.getString("status"));
			usr.setLab(rs.getString("lab"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usr;
	}
	
	public Boolean validate(Users usr){
		String sql = "select * from Users where userName = ?";
		PreparedStatement pstmt;
		Users validUsr = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usr.getUserName());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				validUsr = getUsers(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(validUsr != null){
			if(usr.getPassWord().equals(validUsr.getPassWord()) && usr.getLab().equals(validUsr.getLab()) && usr.getRole().equals(validUsr.getRole()) && validUsr.getStatus().equals("ACTIVE")){
				return true;
			}
		}
		return false;
	}

}
