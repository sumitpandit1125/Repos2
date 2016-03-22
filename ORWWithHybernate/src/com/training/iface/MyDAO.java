package com.training.iface;

import java.util.*;

public interface MyDAO<T> {
	
	public Object add(T t);
	public T find(Object obj);
	public List<T> findAll();
	public Object update(T t);
	public boolean delete(Object obj);

}
