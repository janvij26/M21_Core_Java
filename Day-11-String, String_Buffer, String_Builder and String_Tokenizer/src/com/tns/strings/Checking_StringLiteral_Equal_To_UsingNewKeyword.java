package com.tns.strings;

// A Program for checking the Input String are same or not using == Operator and .equals Method.

// == Operator: Checks the input string value is same or not and it also checks the same input string has same memory location or not, If Yes then it returns ture else false.
// .equals Operator: Checks the input string value is same or not, If Yes then it returns ture else false. It does not check the memory location.


public class Checking_StringLiteral_Equal_To_UsingNewKeyword {

	public static void main(String[] args) 
	{
		// Pre-Defined String Input
	
		// String Literal
		String str1="Janvi";
		String str2="Janvi";
		
		// Using New Keyword
		String str3=new String("Janvi");
		String str4=new String("Janvi");	
		
		// Checking using == Operator
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str2==str3);
		
		// Checking using .equals Operator
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str3));
	
	}

}
