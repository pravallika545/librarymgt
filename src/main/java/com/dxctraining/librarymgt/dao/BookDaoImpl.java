package com.dxctraining.librarymgt.dao;


import java.util.*;



import com.dxctraining.librarymgt.entities.Book;
import com.dxctraining.librarymgt.exceptions.BookNotFoundException;


public  class BookDaoImpl implements IBookDao {
	private Map<String,Book> store=new HashMap<>();
	private int generateid;

	@Override
	public Book findById(String id) {
		Book book=store.get(id);
		if(book==null) {
			throw new BookNotFoundException("book not found");
		}
		return book;
	}

	@Override
	public List<Book> findAll() {
		Collection<Book> values=store.values();
		List<Book> list=new ArrayList<>();
		for(Book value:values) {
			list.add(value);
		}
		return list;
	}

	@Override
	public Book updateCost(String id, double cost) {
		Book book=findById(id);
		book.setCost(cost);
		return book;
	}

	@Override
	public void add(Book book) {
		String id=generateid();
		book.setId(id);
		
	}
	
	
     @Override
	public String generateid() {
		generateid++;
		String idstring=String.valueOf(generateid);
		return idstring;
	}

	@Override
	public Book update(Book book) {
		String id=book.getId();
		return book;
	}

	@Override
	public void delete(Book book) {
		store.remove(book);
	}
	

}