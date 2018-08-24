package com.demo;

public class DemoLambda1 {
 public static void main(String[] args) {
	MyInterface1 m = (x,y) -> {System.out.println("add:"+(x+y));};
	m.add(12, 70);
}
} 
