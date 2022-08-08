package com.tns.strings;

import java.util.Scanner;

public class Concat_Method {

	public static void main(String[] args) 
	{
		// Pre-Defined String Input
		/*
		String str="Janvi";
		String str1=" Is A Engineer";
		System.out.println("The String Using Concat() Method is: "+str.concat(str1));
		*/
					
		// User-Defined String Input
		Scanner s=new Scanner(System.in);
					
		// For Taking 1st String Input 
		System.out.println("Enter the String 1:");
		String str=s.nextLine();
				
		// For Taking 2nd String Input 
		System.out.println("Enter the String 2:");
		String str1=s.nextLine();
		
		// For joining the two Strings using concat() Method.
		System.out.println("The String using Concat() Method is: "+str+" ".concat(str1));
					
		// Closing the Scanner Class
		s.close();

	}

}
