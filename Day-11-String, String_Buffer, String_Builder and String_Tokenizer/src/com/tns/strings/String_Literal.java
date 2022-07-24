package com.tns.strings;

import java.util.Scanner;

// A Program for String Literal
// String Literal: String str="Hello";

public class String_Literal {

	public static void main(String[] args) 
	{
		// Pre-Defined Input
		/* 
		String str="Janvi";
		System.out.println(str); 
		*/
		
		// User-Defined Input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=s.nextLine();
		System.out.println("The String is: "+str);
		s.close();

	}

}
