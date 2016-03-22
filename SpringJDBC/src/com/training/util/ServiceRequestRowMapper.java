package com.training.util;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Customer;
import com.training.entity.Item;
import com.training.entity.ServiceRequest;

public class ServiceRequestRowMapper implements RowMapper<ServiceRequest> {

	@Override
	public ServiceRequest mapRow(ResultSet rs, int arg1) throws SQLException {
		ServiceRequest req = new ServiceRequest();
		Customer cust = new Customer();
		Item item = new Item();
		
		cust.setCutomerName(rs.getString("customername"));
		cust.setPhoneNumber(rs.getLong("phonenumber"));
		
		item.setProductType(rs.getString("producttype"));
		
		req.setCust(cust);
		req.setProduct(item);
		req.setRequestId(rs.getInt("RequestId"));
		req.setDescription(rs.getString("description"));
		req.setDateOfRequest(rs.getDate("dateofrequest"));
		return req;
	}

}
