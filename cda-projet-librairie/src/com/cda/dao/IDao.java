package com.cda.dao;

import java.util.List;

public interface IDao<T> {

	T save(E t);

	void remove(T t);

	T update(T t);

	T findById(int id);

	List<T> getAll();
}
