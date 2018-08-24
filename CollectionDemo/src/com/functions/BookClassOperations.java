package com.functions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperations;

public class BookClassOperations implements BookOperations{
	List<Book> books = new ArrayList<>();
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
	    
		books.add(book);
		return 1;
	}
	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book);
		return books.contains(book);
	}
	@Override
	public Book findBookByID(Book book) {
		// TODO Auto-generated method stub
		int book_id=book.getIsbn();
		Iterator<Book> it = books.iterator();
		return it.next();
	}
	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		//String book_name=;
		List<Book> book_temp= new ArrayList<>();
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			//int i=0;
			if(it.next().getName()==book_name) {
				book_temp.add(it.next());
				
			}
		}
		
		return book_temp;
	}

}
