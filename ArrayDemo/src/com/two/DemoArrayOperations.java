package com.two;

import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {123,34,55,65,43,55,67,89,90};
//		Arrays.fill(numbers, 0);
	//	for(int num:numbers) {
		//	System.out.println(num);
//		}
       Arrays.fill(numbers, 1,3,100);
       for(int num:numbers) {
			System.out.println(num);
		}
      int[] arr_copy =  Arrays.copyOf(numbers,5);
      for(int num: arr_copy) {
    	  System.out.println(num);
      }
      System.out.println("*...comparison...");
      String [] names = {"ABC","XYZ","LMN"};
      
      String [] names1 = {"ABC","XYZ","LMN"};

      boolean data = Arrays.equals(names, names1);
      if(data) {System.out.println("two arrays are equal");
    	  
      }
      System.out.println("*...sorting...*");
      Arrays.sort(numbers);
      for (int num: numbers) {
    	  System.out.println(num);
      }
      System.out.println("*..searching..*");
      int index= Arrays.binarySearch(numbers, 1230);
      System.out.println(index);
	}

}






















