package com.training.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.entity.Customer;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

import java.sql.*;

public class CustomerDAO implements DAO<Customer> {
	
	
	private Connection con;
	
	
	

	public CustomerDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	@Override
	public int add(Customer t) {
		
		String sql = "insert into CUSTOMER values (?,?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getCust_id());
			pstmt.setString(2, t.getName());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getEmail());
			return pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	private Customer getCustomer(ResultSet rs){
		Customer cust = new Customer();
		try {
			cust.setCust_id(rs.getInt("cus_id"));
			cust.setName(rs.getString("cus_name"));
			cust.setHandPhone(rs.getLong("mbl"));
			cust.setEmail(rs.getString("email"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}

	@Override
	public Customer find(int cus_id) {
		
		String sql = "select * from customer where cus_id = ?";
		PreparedStatement pstmt;
		Customer cust = new Customer();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cus_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				cust = getCustomer(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return cust;
	}

	@Override
	public List<Customer> findAll() {
		String sql = "select * from customer";
		PreparedStatement pstmt;
		Customer cust = new Customer();
		List<Customer> custList = new ArrayList<Customer>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				cust = getCustomer(rs);
				custList.add(cust);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return custList;
	}

	@Override
	public int update(int key) {
		String sql = "update customer set cus_name = ? where cus_id = ?";
		PreparedStatement pstmt;
		System.out.println("Enter New Name");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		in.close();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from customer where cus_id = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			return pstmt.executeUpdate();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
