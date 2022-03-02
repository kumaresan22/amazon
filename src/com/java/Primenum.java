package com.java;

public class Primenum {
  
static	int n = 3;

	public static void main(String[] args) {
		
		if (n==0||n==1) {
			System.out.println("not a prime num");
			
		}
		
		else {
			
		for (int i = 2; i <n; i++) {
			
			if (n%i==0) {
				System.out.println("not A PRIME NUM");
			}
			if (i==n) {
				System.out.println("its a primen num");
			}
		}
		
		
		}
		
		
		
	}
	
	
	
	
	
}
