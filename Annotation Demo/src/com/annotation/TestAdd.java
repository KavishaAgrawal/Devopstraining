package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAdd {
   
@PerformOperations()
public static void display() {
	System.out.println("display");
}
public static void main(String[] args) {
	TestAdd test = new TestAdd();
	Class class1 = test.getClass();
	Method[] methods = class1.getMethods();
	for(Method method: methods) {
		Annotation[] annotations = (Annotation[]) method.getAnnotations();
		for (Annotation anno  : annotations) {
			if(anno.annotationType().equals(PerformOperations.class)) {
				PerformOperations m = (PerformOperations) anno;
				int value1 = m.value1();
				int value2 = m.value2();
				System.out.println(value1+value2);
			}
		}
	}
}
}
