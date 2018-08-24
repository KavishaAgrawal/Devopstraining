package com.pojo;

public class Person {
  private int age;
  private String name;
  
  //access_sp return_type fun name(){}
  public void display( ) {
     System.out.println("name:-"+name+"\t"+"age:-"+age);
  }
  
  public Person()
  {
	  age = 10;
	  name="Kavisha";
  }
  
  public Person(int age, String name) {
	// TODO Auto-generated constructor stub

	  this.age = age;
	  this.name = name;
  }
  /*public void setAge (int a) {
	  age =a;
  }*/

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
//public String toString() {
	  //return super.toString + empID + " "  + 
public boolean equals(Object obj) {
	Person p = (Person) obj;
	return (p.getName().equals(name) && p.age == this.age);
}
}
