package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.interfaces.BookIO;
//import com.interfaces.BookOperations;

public class Book implements Comparable<Book>{
	
	private int isbn;
  private String name;
  private String publication;
  private double price;
  public Book() {
	  isbn=12;
	  name = "Core Java";
	  publication = "My Publication";
	  price = 123.50d;
  }
public Book(int isbn, String name, String publication, double d) {
	super();
	this.isbn = isbn;
	this.name = name;
	this.publication = publication;
	this.price = d;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", price=" + price + "]";
}
public void setPrice(double price) {
	this.price = price;
}
  @Override
  public boolean equals(Object arg0) {
	  Book b = (Book)arg0;
	  return this.isbn==b.isbn&&this.name.equals(b.name);
  }
@Override
public int hashCode() {
	return 10;
}
@Override
public int compareTo(Book o) {
	// TODO Auto-generated method stub
	//return this.isbn-o.isbn;
	return this.name.compareTo(o.name);
}
}













