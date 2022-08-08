package com.tns.strings;

import java.util.Scanner;

// A Program for using + Operator to Concatenate the Strings. 

public class AdditionOperator_String {

	public static void main(String[] args) 
	{
		
		// Pre-Defined String Input
		/*
		String str="Janvi "+"is"+" a Engineer";
		System.out.println("The String using + Operator is: "+str);
		*/
					
		// User-Defined String Input
		Scanner s=new Scanner(System.in);
					
		// For Taking String Input 
		System.out.println("Enter the String : ");
		String str=s.nextLine();
		
		/*Using + Operator to print the value before the string 
		and after the string also used the user input value using + Operator */
		System.out.println(15+26+" Janvi"+" is a"+" Engineer. "+15+" "+26+" "+str);
					
		// Closing the Scanner Class
		s.close();
	}

}
