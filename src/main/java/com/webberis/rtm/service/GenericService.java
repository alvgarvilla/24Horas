package com.webberis.rtm.service;

import java.util.List;

public interface GenericService<T> {
	
	public int save(T element);
	
	public void delete(T element);
	
	public List<T> getAll();
	
	public T get(int id);

}
