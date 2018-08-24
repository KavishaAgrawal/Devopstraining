import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class MyDemo {
  public static void main(String[] args) {
	//List<Object> list = new ArrayList<Book>();
	//list.add(new Object());
	//list.add(new Book());
	List<Book> list = new ArrayList<Book>();
	addInfo(list);
	
	List<File> list1 = new ArrayList<File>();
	addInfo1(list1);
	
	List<IOException> list2 = new ArrayList<IOException>();
	addInfo(list2);

}
  public static void addInfo(List<Object> books) {
	  books.add(new Book());
  }
  public static void addInfo1(List<? extends Object> books) {
	  books.add(new Book());
  }
  public static void  addInfo2(List< ? super FileNotFoundException> books) {
	  books.add(new Book());
  }
  
  
  
  
}
