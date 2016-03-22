package com.training.dao;

import java.util.List;

import com.training.entity.ServiceRequest;
import com.training.ifaces.MyDAO;
import com.training.util.ServiceRequestRowMapper;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ServiceRequestDAO extends JdbcDaoSupport implements MyDAO<ServiceRequest> {

	@Override
	public boolean add(ServiceRequest t) {
		
		
		String sql = "insert into serviceRequest values (?,?,?,?,?,?)";
		int res = getJdbcTemplate().update(sql, t.getRequestId(),
														t.getCust().getCutomerName(), 
														t.getCust().getPhoneNumber(),
														t.getProduct().getProductType(),
														t.getDescription(),
														t.getDateOfRequest());
		if(res>0)
			return true;
		else
			return false;
	}

	@Override
	public ServiceRequest find(int key) {
		String sql = "select * from ServiceRequest where requestId = ?";
		ServiceRequest obj = (ServiceRequest) getJdbcTemplate().queryForObject(sql, new ServiceRequestRowMapper(),key);
		return obj;
	}

	@Override
	public List<ServiceRequest> findAll() {
		String sql = "select * from ServiceRequest";
		List<ServiceRequest> objList = getJdbcTemplate().query(sql, new ServiceRequestRowMapper());
		return objList;
	}

}
