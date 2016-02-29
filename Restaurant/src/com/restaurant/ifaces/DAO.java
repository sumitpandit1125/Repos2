package com.restaurant.ifaces;

import java.util.List;

public interface DAO<T> {
	
	public int add(T t);
	public T find(int empId);
	public List<T> findAll();
	public Boolean update (T t);
	public int delete(int key);

}