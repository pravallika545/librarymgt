package com.dxctraining.librarymgt.dao;

import com.dxctraining.librarymgt.entities.Book;

import java.util.*;

public interface IBookDao {
	Book findById(String id);
	List<Book> findAll();
	Book updateCost(String id,double cost);
	Book update(Book book);
	Book findBookId(String id);
	void delete(Book book);
	void add1(Book book);
	void add(Book book);
	void removeBook(String id);
	void addBook(Book book);
	List<Book> showBooks();
	String generateid();

}
