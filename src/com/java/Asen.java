package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class Asen {
public static void main(String[] args) {
	
	
	ArrayList a =  new ArrayList();
	 
	a.add(-2);
	a.add(2);
	a.add(-1);
//
	
	Collections.sort(a);
	for (Object object : a) {
		System.out.println(object);
	}
	System.out.println(a);
	Collections.sort(a,Collections.reverseOrder());
	System.out.println(a);
}



	
	
	
	
}
