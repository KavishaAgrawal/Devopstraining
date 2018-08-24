package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class Mydate {
@DateAnnotation(day = 13, month = "August", year = 2018)
public static void display() {
	System.out.println("display");
}
public static void main(String[] args) {
	Mydate test = new Mydate();
	Class class1 = test.getClass();
	Method[] methods = class1.getMethods();
	for(Method method: methods) {
		Annotation[] annotations = (Annotation[]) method.getAnnotations();
		for (Annotation anno  : annotations) {
			if(anno.annotationType().equals(DateAnnotation.class)) {
				DateAnnotation m = (DateAnnotation) anno;
				int day = m.day();
				System.out.println(day);
			}
		}
		
	}
}
}
