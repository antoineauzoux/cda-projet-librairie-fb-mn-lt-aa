package com.cda.dao;

import java.util.List;

public interface IDao<T> {

	<E> T save(E e);

	void remove(T e);

	<E> T update(E e);

	<E> T find(E e);

	List<T> getAll();

}