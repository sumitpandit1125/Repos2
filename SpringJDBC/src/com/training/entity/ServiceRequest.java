package com.training.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("serviceRequest")
public class ServiceRequest {
	
	private Customer cust;
	private Item product;
	private int requestId;
	private String description;
	private Date dateOfRequest;
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequest(Customer cust, Item product, int requestId, String description, Date dateOfRequest) {
		super();
		this.cust = cust;
		this.product = product;
		this.requestId = requestId;
		this.description = description;
		this.dateOfRequest = dateOfRequest;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Item getProduct() {
		return product;
	}
	public void setProduct(Item product) {
		this.product = product;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateOfRequest() {
		return dateOfRequest;
	}
	public void setDateOfRequest(Date dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}
	@Override
	public String toString() {
		return "serviceRequest [cust=" + cust + ", product=" + product + ", requestId=" + requestId + ", description="
				+ description + ", dateOfRequest=" + dateOfRequest + "]";
	}
	
}
