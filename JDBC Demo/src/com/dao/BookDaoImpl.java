package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.book;
import com.connection.MyConnection;
import com.pojos.Employee;

public class BookDaoImpl implements BookDao{

	@Override
	public boolean addBook(book book) {
		// TODO Auto-generated method stub
		String INSERT_BOOK = "insert into book values(?,?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());

			r = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public int updateBook(book book, String ISBN) {
		// TODO Auto-generated method stub
		int row = 0;
		book b = new book();
		String UPDATE_Book = "update book set name =? where ISBN=?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_Book);
			ps.setString(1, book.getName());
			ps.setString(2, ISBN);
            row = ps.executeUpdate();
			if(row>0) {
				b = book;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		int row = 0;
//		book b =  book();
		String DELETE_Book = "delete from book where ISBN=?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(DELETE_Book);
		    ps.setString(1, ISBN);
		    row = ps.executeUpdate();
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public book findBOOKByISBN(String ISBN) {
		// TODO Auto-generated method stub
		book b  = new book();
		String Find_By_ISBN = "select*from book where ISBN =?";
		PreparedStatement ps;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(Find_By_ISBN);
			ps.setString(1,ISBN);
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				b = new book(set.getString("ISBN"),set.getString("name"),set.getString("publication"), set.getString("author"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	
	}

	@Override
	public List<book> findBOOKByName(String name) {
		// TODO Auto-generated method stub
		List<book> books = new ArrayList<book>();
		book b  = new book();
		String Find_By_Name = "select*from book where Name =?";
		PreparedStatement ps;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(Find_By_Name);
			ps.setString(1, name);
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				b = new book(set.getString("ISBN"),set.getString("name"),set.getString("publication"), set.getString("author"));
			    books.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public List<book> findAllBooks() {
		// TODO Auto-generated method stub
		List<book> books = new ArrayList<book>();
		 String FIND_ALL_BOOKS="select *from book";
			try {
				Statement st = MyConnection.getMyConnection().createStatement();
				ResultSet set = st.executeQuery(FIND_ALL_BOOKS);
				while(set.next()) {
					String ISBN = set.getString(1);
					String name = set.getString(2);
					String publication = set.getString(3);
					String author = set.getString(4);
					book b = new book(ISBN, name, publication, author);
					books.add(b);
					//System.out.println(empID+" "+salary);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return books;
	}

	@Override
	public List<book> findBOOKByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		List<book> books = new ArrayList<book>();
		book b  = new book();
		String Find_By_Author = "select*from book where Author =?";
		PreparedStatement ps;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(Find_By_Author);
			ps.setString(1, auth_name);
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				b = new book(set.getString("ISBN"),set.getString("name"),set.getString("publication"), set.getString("author"));
			    books.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}
    
}
