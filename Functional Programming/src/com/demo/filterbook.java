package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class filterbook {
  public static void main(String[] args) {
	List<Book> books = new ArrayList<>();
	books.add(new Book(1, "name1", "publication1", 10d));
	books.add(new Book(2, "name2", "publication2", 5d));
	books.add(new Book(3, "name3", "publication3", 15d));
	books.add(new Book(4, "name4", "publication4", 20d));
	Iterator<Book> iterator = books.iterator();
	while(iterator.hasNext()) {
		Book book=iterator.next();
		System.out.println(book);
	}
	System.out.println("testing");
	books.stream().filter(Book -> {
		return Book.getPrice()>=15d;}).collect(Collectors.toList()).
	                               forEach(System.out::println);}
	//System.out.println(books);
	
}

