package com.pojos;

public class Employee {
 private int empID, salary;
 private String name;
 public Employee() {
	 empID=10;
	 salary=10000;
	 name="no name";
 }
public Employee(int empID, int salary, String name) {
	super();
	this.empID = empID;
	this.salary = salary;
	this.name = name;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}
