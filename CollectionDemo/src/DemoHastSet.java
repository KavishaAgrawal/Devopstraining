import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.beans.Book;

public class DemoHastSet {
  public static void main(String[] args) {
	Set<Book> books = new HashSet<>();
	books.add(new Book());
	books.add(new Book(123,"Adv Java","Oracle",1234d));
	books.add(new Book(300,"A Java","Oracle",3000d));
	books.add(new Book(123,"Ad Java","Oracle",1234d));
    System.out.println("size:"+books.size());
    Iterator<Book>iterator = books.iterator();
    while(iterator.hasNext()) {
    	System.out.println(iterator.next());
    }
}
}
