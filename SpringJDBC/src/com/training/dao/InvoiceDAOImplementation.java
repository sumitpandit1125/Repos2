package com.training.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;
import com.training.util.InvoiceRowMapper;

public class InvoiceDAOImplementation extends JdbcDaoSupport implements MyDAO<Invoice> {

	@Override
	public boolean add(Invoice t) {
		
		boolean result = false;
		String sql = "insert into Invoice values (?,?,?)";
		int rowInserted = getJdbcTemplate().update(sql,t.getInvoiceNumber(),t.getCustomerName(),t.getAmount());
		if(rowInserted>0){
			result = true;
		}
		return result;
		
	}

	@Override
	public Invoice find(int key) {
		String sql = "select * from Invoice where invoiceNumber = ?";
		Invoice inv = getJdbcTemplate().queryForObject(sql, new InvoiceRowMapper(), key);
		return inv;
	}

	@Override
	public List<Invoice> findAll() {
		String sql = "select * from Invoice";
		List<Invoice> invList = (List)getJdbcTemplate().query(sql, new InvoiceRowMapper());
		
		return invList;
	}
	
	

}
