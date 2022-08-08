package com.tns.strings;
import java.util.Scanner;

//A Program for Converting the UpperCase Characters to LowerCase Characters and LowerCase Characters to UpperCase Characters.

public class UpperCase_LowerCase {
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
			System.out.println("Enter the String : ");
			String str=s.nextLine();
			
			// For Converting the String Characters From LowerCase to UpperCase.
			System.out.println("The String Character in UpperCase are: "+str.toUpperCase());
			
			// For Converting the String Characters From UpperCase to LowerCase.
			System.out.println("The String Character in LowerCase are: "+str.toLowerCase());
			
			// Closing the Scanner Class
			s.close();
			
		}

}


