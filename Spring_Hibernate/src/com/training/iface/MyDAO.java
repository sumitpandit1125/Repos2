package com.training.iface;

import java.io.Serializable;
import java.util.*;

public interface MyDAO<T> {
	
	public Serializable add(T t);
	public T find(Object obj);
	public List<T> findAll();
	public Object update(T t);
	public boolean delete(Object obj);

}
