package com.myabstract;

 public class Circle extends Shape {
    private int radius;
    public Circle() {
		// TODO Auto-generated constructor stub
	radius = 10;
    }
    	
  
	public Circle (int radius,String name) {
		super(name);
		this.radius = radius;
	}


	public double area() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}



	}
