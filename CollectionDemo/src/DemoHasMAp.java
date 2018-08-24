
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHasMAp {
 public static void main(String[] args) {
	Map<String, List<Book>> m = new HashMap<>();
	List<Book> book_java = new ArrayList<>();
	book_java.add(new Book(1, "Java1", "publication1", 10d));
	book_java.add(new Book(2, "Java2", "publication2", 20d));
	
	m.put("Citi", book_java);
	
	List<Book> book_core = new ArrayList<>();
	book_core.add(new Book(3, "Thermo", "publication3", 100d));
	book_core.add(new Book(4, "FM", "publication4", 200d));
	book_core.add(new Book(5, "PDC", "publication5", 300d));
	m.put("Wipro", book_core);
	Set<Entry<String, List<Book>>> entries1 = m.entrySet();
	Iterator<Entry<String, List<Book>>> iterator1=entries1.iterator();
	while(iterator1.hasNext()) {
		Entry<String, List<Book>> entry = iterator1.next();
		System.out.println("*Book Catergory:" +entry.getKey()+"*");
		List<Book> books = entry.getValue();
		//System.out.println(entry.getKey()+"::"+entry.getValue());
		for (Book book:books) {
			System.out.println(book.getName()+ ":"+book.getIsbn()+":"+book.getPublication()+":"+book.getPrice());
		}
	}
	//m.put("Accenture", "Malad");
	//System.out.println(m);
	
	
	List<Book> book_stories = new ArrayList<>();
	book_stories.add(new Book(6, "name1", "publication6", 5d));
	m.put("Citi", book_stories);
	System.out.println("after duplicate key");
	System.out.println(m);
	Set<Entry<String, List<Book>>> entries = m.entrySet();
	Iterator<Entry<String, List<Book>>> iterator=entries.iterator();
	while(iterator.hasNext()) {
		Entry<String, List<Book>> entry = iterator.next();
		System.out.println("*Book Catergory:" +entry.getKey()+"*");
		List<Book> books = entry.getValue();
		//System.out.println(entry.getKey()+"::"+entry.getValue());
		for (Book book:books) {
			System.out.println(book.getName()+ ":"+book.getIsbn()+":"+book.getPublication()+":"+book.getPrice());
		}
	}
}
}
