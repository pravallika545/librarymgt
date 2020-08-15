package com.dxctraining.librarymgt.service;

import java.util.*;

import com.dxctraining.librarymgt.entities.Book;

public interface BookService {
	List<Book> findAll();
	void add(Book book);
	Book update(Book book);
	void delete(Book book);
	Book updateCost(String id, double cost);
	Book findById(String id);
	Book updateBookcost(String id, double cost);
	void removeBook(String id);
	void addBook(Book book);
	Book findBookId(String id);
	List<Book> showBooks();
}