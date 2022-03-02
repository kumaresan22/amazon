package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class Arr {

	
	
	 
	
	public static void main(String[] args) {
	 ArrayList cars = new ArrayList();
		 ArrayList<Integer> emp = new ArrayList<Integer>();
		 cars.add(10);
		 cars.add(20);
		 cars.add(10);
		 cars.add("kumar");
		 emp.add(10);
		// emp.retainAll(cars);
		emp.addAll(cars);
		cars.set(0, 25);
	boolean contains1 = cars.contains("kumar");
	System.out.println(contains1);
		 boolean contains = emp.containsAll(cars);
		 System.out.println(contains);
		//ollections.sort(cars);
	 System.out.println(cars);
	System.out.println(emp);
	}
	
	
	
	
	
	
	
}
