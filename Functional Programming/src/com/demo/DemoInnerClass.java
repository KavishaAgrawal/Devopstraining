package com.demo;

public class DemoInnerClass {
 MyInterface m = new MyInterface() {
	
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("displaying data from inner class");
	}
};
}
