package com.chainsys.oops1;

import java.util.regex.Pattern;

public class Validation {
	public  boolean inputchecker(int n) 
	{
		if(n<0) {
			System.out.println("Error! Negative number detected. Cannot proceed.");
			return false;
		}
		return true;
	}
	public  boolean inputchecker1(double n) 
	{
		if(n<0) {
			System.out.println("Error! Negative number detected. Cannot proceed.");
			return false;
		}
		return true;
	}
	public  boolean numberchecker(String s) 
	{
		try
		{
			Integer.parseInt(s);
			System.out.println("Dont use numbers");
			return false;
			
		}
		catch(Exception e){
			
			return true;
			
		}
	}
	 public boolean isSpecialChar(String input)
	 {
	      
	        String specialCharRegex = "^[a-zA-Z]{4,20}+$";
	        if(Pattern.matches(specialCharRegex, input))
	        {
	        	return true;
	        }
	        else {
	        	System.out.println("Invalid don not use special character");
	        	return false;
	        }
	    }
	 

}
