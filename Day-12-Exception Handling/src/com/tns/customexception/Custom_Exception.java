package com.tns.customexception;

import java.util.Scanner;


// Checked Exception
// Create an own Exception
@SuppressWarnings("serial")
class NameNotFound extends Exception
{
	// Constructor
	NameNotFound(String name)
	{
		super(name);
	}
}

public class Custom_Exception {
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try
		{
			empname(str);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
	static void empname(String str)throws NameNotFound
	{
		if(str.isEmpty())
		{
			// Throwing an Exception Explicitly
			throw new NameNotFound("Employee Name id Empty");
		}
		else
		{
			System.out.println("Hello "+str+" ");
		}
		
	 }	

}
