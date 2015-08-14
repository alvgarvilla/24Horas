package com.webberis.rtm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webberis.rtm.dao.GenericAbstractDAO;
import com.webberis.rtm.dao.GenericDAO;

@Repository
public class GenericDaoImpl<T> extends GenericAbstractDAO<T> implements GenericDAO<T>{

	@SuppressWarnings("unchecked")
	public T save(Object element) {
		super.persist(element);
		return (T) element;
	}

	public void delete(Object element) {
		super.delete(element);
	}

	public List<T> getAll(Class<T> clazz) {
		return super.getAll(clazz);
	}

	public T get(Class<T> clazz, int id) {
		return super.get(clazz, id);
	}

}
