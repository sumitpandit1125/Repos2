package com.clinicallab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.clinicallab.entity.Patient;
import com.clinicallab.ifaces.DAO;
import com.clinicallab.utils.SqlConnection;

public class PatientDAO implements DAO<Patient> {

	private Connection con;
	
	public PatientDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	@Override
	public int add(Patient t) {
		String sql = "insert into Patient values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getId());
			pstmt.setString(2,t.getName());
			pstmt.setLong(3,t.getMobile());
			pstmt.setString(4,t.getSex());
			pstmt.setString(5,t.getAddress());
			pstmt.setDate(6, t.getDOB());
			return pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Patient find(int id) {
		String sql = "select * from Patient where id =? ";
		PreparedStatement pstmt;
		Patient pat = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				pat = getPatient(rs);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pat;
		
	}

	@Override
	public List<Patient> findAll() {
		String sql = "select * from Patient";
		PreparedStatement pstmt;
		Patient pat = new Patient();
		ArrayList<Patient> patList = new ArrayList<Patient>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				pat = getPatient(rs);
				patList.add(pat);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return patList;
	}

	@Override
	public int update(Patient key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private Patient getPatient(ResultSet rs){
		Patient pat = new Patient();
		try {
			pat.setId(rs.getInt("id"));
			pat.setName(rs.getString("name"));
			pat.setMobile(rs.getLong("mobile"));
			pat.setSex(rs.getString("sex"));
			pat.setAddress(rs.getString("address"));
			pat.setDOB(rs.getDate("dOB"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pat;
	}

}
