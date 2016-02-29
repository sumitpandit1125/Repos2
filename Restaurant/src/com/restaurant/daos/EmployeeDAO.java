package com.restaurant.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.restaurant.entity.Employee;
import com.restaurant.ifaces.DAO;
import com.restaurant.utils.SqlConnection;



public class EmployeeDAO implements DAO<Employee> {

	private Connection con;
	
	
	
	public EmployeeDAO() {
		super();
		con = SqlConnection.getOracleConnection();
	}

	
	
	@Override
	public int add(Employee e) {
		String sql = "insert into EMPLOYEEvalues (?,?,?)";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, e.getEmpId());
			pstmt.setString(2, e.getEmpName());
			pstmt.setDouble(3, e.getEmpMobile());
			
			return pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
		
		}
		return 0;
	}

	@Override
	public Employee find(int empId) {
		String sql = "select * from EMPLOYEE where empId = ?";
		PreparedStatement pstmt;
		Employee emp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				
				emp = getEmployee(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
		
	}

	@Override
	public List<Employee> findAll() {
		String sql = "select * from Employee";
		PreparedStatement pstmt;
		Employee emp = null;
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				emp = getEmployee(rs);
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int delete(int key) {
		String sql = "delete from EMPLOYEE where empId = ?";
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
	
	@Override
	public Boolean update(Employee e){
		String sql = "update Employee set empName = ?, empMobile = ?  where empId = ?";
		
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, e.getEmpName());
			pstmt.setLong(2, e.getEmpMobile());
			pstmt.setInt(3, e.getEmpId());
			pstmt.executeUpdate();
			
			
		} catch (SQLException exc) {
			System.out.println(exc.getMessage());
			return false;
		}
		
		
		return true;
	}
	
	
	private Employee getEmployee(ResultSet rs){
		
		
		Employee emp = null;
		try {
			emp = new Employee(rs.getInt("empId"), rs.getString("empName"), rs.getLong("empMobile"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

}
