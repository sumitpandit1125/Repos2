package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.restaurant.entity.Bill;
import com.restaurant.entity.Item;
import com.restaurant.entity.Orders;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;

public class BillDAO implements DAO<Bill> {

private Connection con;
	
	
	
	public BillDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	@Override
	public int add(Bill billObj) {
		String sql = "insert into Bill values (?,?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, billObj.getBillNo());
			pstmt.setTimestamp(2, billObj.getTime());
			pstmt.setString(3, billObj.getCustomerName());
			pstmt.setInt(4, billObj.getNumberOfDiner());
			pstmt.setInt(5, billObj.getTableNo());
			pstmt.setDouble(6, billObj.getAmount());
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Bill find(int billNo) {
		String sql = "select * from Bill where billNo = ?";
		PreparedStatement pstmt;
		Bill billObj = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, billNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				billObj = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return billObj;
		
	}

	@Override
	public List<Bill> findAll() {
		String sql = "select * from Bill";
		PreparedStatement pstmt;
		Bill billObj = null;
		List<Bill> orderList = new ArrayList<Bill>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				billObj = getItem(rs);
				orderList.add(billObj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from Bill where billNo = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException billObj) {
			billObj.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(Bill billObj){
		String sql = "update Bill set Time = ?, CustomerName = ?,"
								+ " NumberOfDiner =?, TableNo = ? "
								+ " Amount =? where BillNo = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(6, billObj.getBillNo());
			pstmt.setTimestamp(1, billObj.getTime());
			pstmt.setString(2, billObj.getCustomerName());
			pstmt.setInt(3, billObj.getNumberOfDiner());
			pstmt.setInt(4, billObj.getTableNo());
			pstmt.setDouble(5, billObj.getAmount());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	
	private Bill getItem(ResultSet rs){
		
		
		Bill billObj = null;
		try {
			billObj = new Bill(rs.getInt("BillNo"), 
							rs.getTimestamp("Time"), 
							rs.getString("CustomerName"),
							rs.getInt("NumberOfDiner"),
							rs.getInt("TableNo"),
							rs.getDouble("Amount"));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return billObj;
	}
	
	public Double generateBillAmount(Integer billNo){
		
		Double amount = 0.0;
		
		OrdersDAO odrDOA = new OrdersDAO();
		ArrayList<Orders> odrList = (ArrayList<Orders>) odrDOA.findAllWithSameBillNo(billNo);
		ItemDAO itmDAO = new ItemDAO();
		Item itmObj = null;
		
		for(Orders odrObj : odrList){
			
			itmObj = itmDAO.find(odrObj.getItemCode());
			amount += (itmObj.getRate() * odrObj.getQuantity());
		}
		
		
		return amount;
	}
	
	
}
