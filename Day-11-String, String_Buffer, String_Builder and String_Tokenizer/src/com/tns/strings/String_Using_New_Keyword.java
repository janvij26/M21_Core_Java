package com.tns.strings;

import java.util.Scanner;

// A Program on String Using New Keyword
// Using New Keyword: String s=new String("Hello");

public class String_Using_New_Keyword {

	public static void main(String[] args) 
	{
		// Pre-Defined Input
		/*
		String s=new String("Janvi");
		System.out.println("The String Using New Keyword is: "+s);
		*/
		
		// User-Defined Input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=new String(s.nextLine());
		System.out.println("The String is: "+str);
		s.close();


	}

}
