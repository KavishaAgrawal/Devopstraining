import com.pojo.Person;

public class TestEmployee1 {
 public static void main(String[] args) {
	Person p1 = new Person(12,"ABC");
	Person p2 = new Person(12,"ABC");
//	p1 = (12,"ABC");
//	p2 = (12,"ABC");
	if (p1.equals(p2)) {
		System.out.println("Both are equal");
	}
	else {
		System.out.println("Not Equal");
	}
}
}
