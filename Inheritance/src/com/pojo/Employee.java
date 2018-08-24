package com.pojo;

public class Employee extends Person {
  private int empID;
  private double empSalary;
  public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public Employee() {
	super(); 
	empID = 0;
	  empSalary = 1000;
  }
  public Employee(int empID, double empSalary, int age, String name) {
	  super(age,name);
	  this.empID = empID;
	  this.empSalary = empSalary;
  }
  public void display(int x) {
	  System.out.println(empID+ "\t"+empSalary);
	  //System.out.println("name:-"+getName() );
	  super.display();
  }
  
}
