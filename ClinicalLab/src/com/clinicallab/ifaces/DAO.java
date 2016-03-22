package com.clinicallab.ifaces;

import java.util.List;

public interface DAO<T> {
	
	public int add(T t);
	public T find(int id);
	public List<T> findAll();
	public int update (T id);
	public int delete(int id);
	
}
