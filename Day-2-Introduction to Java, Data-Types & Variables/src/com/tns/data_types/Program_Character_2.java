package com.tns.data_types;

import java.util.Scanner;

public class Program_Character_2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char a=s.next().charAt(4);
		System.out.println("The Character is : "+a);
		s.close();

	}

}
