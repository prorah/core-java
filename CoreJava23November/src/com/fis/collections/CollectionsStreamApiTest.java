package com.fis.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Example to demonstrate Stream API in java 8
public class CollectionsStreamApiTest {

	public static void main(String[] args) {
		Author auth1 = new Author("a");
		Author auth2 = new Author("b");
		Book book1 = new Book("book1", 2010, auth1);
		Book book2 = new Book("book2", 2011, auth2);
		
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.stream()
	       .filter(book -> book.getYear() > 2010) //filter books for which year is greater than 2010
	       .map(Book::getAuthor)             //Get Author property from Book
	       .map(Author::getName)            //Get Name property from Author
	       .forEach(System.out::println); 
	}

}
