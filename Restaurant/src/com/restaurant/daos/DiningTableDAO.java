package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.restaurant.entity.DiningTable;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;

public class DiningTableDAO implements DAO<DiningTable>{
	
private Connection con;
	
	
	
	public DiningTableDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	@Override
	public int add(DiningTable table) {
		String sql = "insert into DiningTable values (?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, table.getTableNo());
			pstmt.setInt(2, table.getEmpId());
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public DiningTable find(int tableNo) {
		String sql = "select * from DiningTable where tableNo = ?";
		PreparedStatement pstmt;
		DiningTable table = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, tableNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				table = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return table;
		
	}

	@Override
	public List<DiningTable> findAll() {
		String sql = "select * from DiningTable";
		PreparedStatement pstmt;
		DiningTable table = null;
		List<DiningTable> tableList = new ArrayList<DiningTable>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				table = getItem(rs);
				tableList.add(table);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tableList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from DiningTable where tableNo = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException table) {
			table.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(DiningTable table){
		String sql = "update DiningTable set empId = ? where tableNo = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, table.getEmpId());
			pstmt.setInt(2, table.getTableNo());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	
	private DiningTable getItem(ResultSet rs){
		
		
		DiningTable table = null;
		try {
			table = new DiningTable(rs.getInt("tableNo"), rs.getInt("empId"));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return table;
	}
	
	

	
}
