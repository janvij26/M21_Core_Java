package com.tns.strings;

import java.util.Scanner;

// A Program for Finding The Length of Given String Input

public class Length_of_String {

	public static void main(String[] args) 
	{
		// Pre-Defined String Input
		//String str="Janvi";
		
		// User-Defined String Input
		Scanner s=new Scanner(System.in);
		
		// For Taking String Input 
		System.out.println("Enter the String: ");
		String str=s.nextLine();
		
		// For Giving the Output: Length of Input String
		System.out.println("The Length of String is: "+str.length());
		
		// Closing the Scanner Class
		s.close();
	}

}
