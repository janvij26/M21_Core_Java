package com.tns.strings;

import java.util.Scanner;

public class InputString_Dhoni {

	public static void main(String[] args)
	{
		// Pre-Defined String Input
		//String s="Dhoni";
		
		// User-Defined String Input
		Scanner s1=new Scanner(System.in);
		
		// For Taking 1st String Input 
		System.out.println("Enter the String 1:");
		String s2=s1.nextLine();
		
		// For Taking 2nd String Input 
		System.out.println("Enter the String 2:");
		String s3=s1.nextLine();
		
		// Checking whether the String Input Matches or Not Match
		if(s2.equals(s3))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
			
		//Closing the Scanner Class
		s1.close();
		
	}

}
