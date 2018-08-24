import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.beans.book;
import com.dao.BookDao;
import com.dao.BookDaoImpl;

public class TestBook {
  public static void main(String[] args) throws IOException {
	System.out.println("enter book details:");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter ISBN");
	String ISBN = br.readLine();
	System.out.println("enter book name");
	String name = br.readLine();
	System.out.println("enter publication");
	String publication = br.readLine();
	System.out.println("enter author name");
	String author = br.readLine();
	 book mybook = new book(ISBN, name, publication, author);
	 BookDaoImpl dao = new BookDaoImpl();
	 boolean rows = dao.addBook(mybook);
	 if (rows =true) {
		 System.out.println("record inserted successfully");
	 }else 
		 System.out.println("try again");
	 
	
}
}
