package com.tns.operator;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args)
	{
		//int a=8, b=1;
		
		Scanner s=new Scanner(System.in);
		 
		System.out.println("Enter the Value of A is : ");
		int a=s.nextInt();
		  
		System.out.println("Enter the Value of B is : ");
		int b=s.nextInt();
		
		int result_1= a & b;
		System.out.println("The result of Bitwise AND Operator is : "+result_1);
		
		int result_2= a | b;
		System.out.println("The result of Bitwise OR Operator is : "+result_2);
		
		int result_3= a ^ b;
		System.out.println("The result of Bitwise X-OR Operator is : "+result_3);
		
		int result_4=a<<b;
		System.out.println("The result of Bitwise Left Shift Operator is : "+result_4);
		
		int result_5=a>>b;
		System.out.println("The result of Bitwise Right Shift Operator is : "+result_5);
		
		s.close();	
	}

}
