package com.tns.pattern;

import java.util.Scanner;

public class RightAngleTrianglePattern {

	public static void main(String[] args) 
	{	 
		//int i, j, row=5;   
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Value :");
		int a=s.nextInt();
		
		s.close();
		 
		for(int i=0; i<a; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
		
				System.out.print(i+" "); 
			
			}
			System.out.println();
	
		}   
}
}