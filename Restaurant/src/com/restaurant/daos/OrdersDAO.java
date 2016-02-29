package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.entity.Orders;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;
import com.restaurant.utils.Utility;

public class OrdersDAO implements DAO<Orders> {

private Connection con;
	
	
	
	public OrdersDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	@Override
	public int add(Orders ord) {
		String sql = "insert into Orders values (?,?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, ord.getOrderId());
			pstmt.setInt(2, ord.getBillNo());
			pstmt.setInt(3, ord.getItemCode());
			pstmt.setInt(4, ord.getQuantity());
			pstmt.setString(5, Utility.booleanToString(ord.getStatus()));
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Orders find(int orderId) {
		String sql = "select * from Orders where OrderId = ?";
		PreparedStatement pstmt;
		Orders ord = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, orderId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				ord = getItem(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return ord;
		
	}

	@Override
	public List<Orders> findAll() {
		String sql = "select * from Orders";
		PreparedStatement pstmt;
		Orders ord = null;
		List<Orders> orderList = new ArrayList<Orders>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				ord = getItem(rs);
				orderList.add(ord);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderList;
	}
	
	public List<Orders> findAllWithSameBillNo(int billNo) {
		String sql = "select * from Orders where BillNo = ?";
		PreparedStatement pstmt;
		Orders ord = null;
		List<Orders> orderList = new ArrayList<Orders>();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, billNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				ord = getItem(rs);
				orderList.add(ord);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from Orders where OrderId = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException ord) {
			ord.printStackTrace();
		}
		return 0;
	}
	
	
	@Override
	public Boolean update(Orders ord){
		String sql = "update Orders set BillNo = ?,itemCode = ?, "
									+ "quantity = ?, status =?,  where OrderId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(5, ord.getOrderId());
			pstmt.setInt(1, ord.getBillNo());
			pstmt.setInt(2, ord.getItemCode());
			pstmt.setInt(3, ord.getQuantity());
			pstmt.setString(4, Utility.booleanToString(ord.getStatus()));
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	
	private Orders getItem(ResultSet rs){
		
		
		Orders ord = null;
		try {
			ord = new Orders(rs.getInt("OrderId"), 
							rs.getInt("BillNo"), 
							rs.getInt("ItemCode"),
							rs.getInt("Quantity"),
							Utility.stringToBoolean(rs.getString("Status")));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return ord;
	}
	
	
}
