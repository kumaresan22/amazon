package com.java;

import java.util.StringJoiner;

public class Split {

	
	
	public static void main(String args[])
    {
        String str = "kumar@#$love";
     String[] ar = str.split("[@,#,$]+");
  
        for (String a : ar)
            System.out.println(a);
}
}