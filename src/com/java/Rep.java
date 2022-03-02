package com.java;

public class Rep {

	
	
	
	 public static void main(String[] args)
	   {
	      String input="hello hi hello hi hi";  //Input String 
	      String[] words=input.split(" ");  //Split the word from String
	      int wrc=1;    //Variable for getting Repeated word count
	   
	    
	      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
	      {
	         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
	         {
	            
	         if(words[i].equals(words[j]))  //Checking for both strings are equal
	            {
	              wrc=wrc+1;    //if equal increment the count
	             // words[j]="0"; //Replace repeated words by zero
	               System.out.println(words[i]);
	            System.out.println(wrc);
	             
	            }
	      
	         }
	      }
	   } 
}
