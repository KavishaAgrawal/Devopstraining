package com.demo;

public class MyInterafceImpl implements MyInterface{

	@Override
	public void showData() {
		// TODO Auto-generated method stub
	System.out.println("shoing data for implementation");	
	}
 public static void main(String[] args) {
	MyInterface m = new MyInterafceImpl();
	m.showData();
}

}
