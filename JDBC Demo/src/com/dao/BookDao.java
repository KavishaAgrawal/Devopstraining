package com.dao;

import java.sql.PreparedStatement;
import java.util.List;

import com.beans.book;
import com.connection.MyConnection;

public interface BookDao {
   boolean addBook(book book );
   int updateBook(book book, String ISBN);
   int deleteBook(String ISBN);
   book findBOOKByISBN(String ISBN);
   List<book> findBOOKByName(String name);
   List<book> findAllBooks();
   List<book> findBOOKByAuthor(String auth_name);
}

	 