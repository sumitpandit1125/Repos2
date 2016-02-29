package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.entity.Item;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;
import com.restaurant.utils.Utility;

public class ItemDAO implements DAO<Item>{
	
private Connection con;
	
	
	
	public ItemDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	@Override
	public int add(Item itm) {
		String sql = "insert into Item values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, itm.getItemCode());
			pstmt.setString(2, itm.getName());
			pstmt.setString(3, itm.getType());
			pstmt.setFloat(4, itm.getRate());
			pstmt.setString(5, Utility.booleanToString(itm.isInStock()));
			pstmt.setString(6, Utility.booleanToString(itm.isVeg()));
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Item find(int itemCode) {
		String sql = "select * from Item where ItemCode = ?";
		PreparedStatement pstmt;
		Item itm = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, itemCode);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				itm = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return itm;
		
	}

	@Override
	public List<Item> findAll() {
		String sql = "select * from Item";
		PreparedStatement pstmt;
		Item itm = null;
		List<Item> itmList = new ArrayList<Item>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				itm = getItem(rs);
				itmList.add(itm);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itmList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from Item where ItemCode = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException itm) {
			itm.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(Item itm){
		String sql = "update Item set name = ?, type = ?, "
									+ "rate = ?, inStock =?, "
									+ " isveg = ? where itemCode = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, itm.getName());
			pstmt.setString(2, itm.getType());
			pstmt.setFloat(3, itm.getRate());
			pstmt.setString(4, Utility.booleanToString(itm.isInStock()));
			pstmt.setString(5, Utility.booleanToString(itm.isVeg()));
			pstmt.setFloat(6, itm.getItemCode());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	
	private Item getItem(ResultSet rs){
		
		
		Item itm = null;
		try {
			itm = new Item(rs.getInt("ItemCode"), 
							rs.getString("name"), 
							rs.getString("type"),
							rs.getFloat("rate"),
							Utility.stringToBoolean(rs.getString("inStock")),
							Utility.stringToBoolean(rs.getString("isVeg")));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return itm;
	}
	
	

	
}
