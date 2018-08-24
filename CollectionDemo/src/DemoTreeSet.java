import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {
  public static void main(String[] args) {
	Set<Book>books = new TreeSet<>(new MyComparator());
	books.add(new Book());
	books.add(new Book(123,"Adv Java","Oracle",1234d));
	books.add(new Book(300,"8 Java","Oracle",3000d));
	books.add(new Book(123,"SAv Jav9","Oracle",124d));
	System.out.println("size:"+books.size());
	System.out.println(books);
}
}
