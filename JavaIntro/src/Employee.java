
public class Employee {
 private int empID;
 private double salary;
 private String empName;
 private String companyName;
 
 public Employee() {
	 empID = 10;
	 empName= "city";
	 salary = 1000;
	 companyName = "citi LTD";
	
 }
 public Employee (int empID, String empName, double salary) {
	 this();
	 this.empID=empID;
	 this.salary=salary;
 }
public void display() {
 System.out.println(empName+"\t"+empID+"\t"+companyName);
 
}
public static void main(String[] args) {
	Employee emp = new Employee(1200,"emp name1",12000d);
	emp.display();
}
}
