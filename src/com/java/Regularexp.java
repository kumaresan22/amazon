package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regularexp {
public static void main(String[] args) {
	
	
	String i = "hai this is 123";
	String Patter =  "(/d)";
	Pattern r =  Pattern.compile(Patter);
	Matcher m = r.matcher(i);
	
	
	if (m.find( )) {
		
	m.group(0);
	System.out.println(m);
		
		
	}
	
}
	
	
	
	
}
