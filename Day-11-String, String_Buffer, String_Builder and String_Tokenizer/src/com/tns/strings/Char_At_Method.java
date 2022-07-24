package com.tns.strings;

import java.util.Scanner;

// A Program for Finding The Length of Given String Input

public class Char_At_Method {

		public static void main(String[] args) 
		{
			// Pre-Defined String Input
			/*
			String str="Janvi";
			System.out.println("The Character of String is: "+str.charAt(2));
			 */
			
			
			// User-Defined String Input
			Scanner s=new Scanner(System.in);
			
			// For Taking String Input 
			System.out.println("Enter the String: ");
			String str=s.nextLine();
			
			// For Giving the Output: Length of Input String
			System.out.println("The Character of String is: "+str.charAt(2));
			
			// Closing the Scanner Class
			s.close();
		}

}



