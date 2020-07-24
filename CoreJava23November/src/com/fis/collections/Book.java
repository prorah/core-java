package com.fis.collections;

public class Book {
	private String name;
	private int year;
	private Author author;

	public Book(String name, int year, Author author) {
		super();
		this.name = name;
		this.year = year;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
