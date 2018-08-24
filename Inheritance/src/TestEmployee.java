import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployee {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter age");
	int age = sc.nextInt();
	System.out.println("enter name");
	String name = sc.next();
	   Employee emp = new Employee(123,20000d,age,name);
	emp.display();
	sc.close();
}
}
