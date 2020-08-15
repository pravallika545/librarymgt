package com.dxctraining.librarymgt.entities;


public class Book {
	private String id;
	private String name;
	private Author author;
	private double cost;
	

	public Book(String id, String name, Author author, double cost) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
