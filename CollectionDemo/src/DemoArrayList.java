import java.util.ArrayList;
import java.util.*;

public class DemoArrayList {
  public static void main(String[] args) {
	List<String> l = new ArrayList();
	l.add("ABC");
	l.add("XYZ");
	l.add("C");
	l.add("LMN");
	l.add("ABC");
	//l.add(new Double(123.45d));
	//l.add(new Object());
	//l.add(new File("data.txt"));
	System.out.println(l);
	int size = l.size();
	System.out.println("size is:"+size);
	l.add(2, "New Data");
	System.out.println(l);
	//l.remove(3);
	//System.out.println(l);
	boolean found = l.contains("New Data");
	if(found) {
		System.out.println("available");
	}else {
		System.out.println("Not available");
	}
	
	Object o =l.get(3);
	System.out.println("your data is:"+o);
	o=l.remove(0);
	System.out.println("you removed:"+o);
	
	boolean removed=l.remove("New Data");
	if(removed) {
		System.out.println("removed successfully");
	}
	else {
		System.out.println("Sorry cant be removed");
	}
	System.out.println("updated size:"+l.size());
	Iterator<String> it = l.iterator();
	while(it.hasNext()) {
		String data=it.next();
		System.out.println(data);
	}
}

//private static void remove(int i) {
	// TODO Auto-generated method stub
	
//}
}
