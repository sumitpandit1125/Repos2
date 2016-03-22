package com.training.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowCount) throws SQLException {
		Invoice inv = new Invoice();
		inv.setInvoiceNumber(rs.getInt("invoiceNumber"));
		inv.setCustomerName(rs.getString("customername"));
		inv.setAmount(rs.getDouble("amount"));
		return inv;
	}
	
	

}
