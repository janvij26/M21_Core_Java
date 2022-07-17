package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) 
	{		
		  //int a=1, b=5;
		  Scanner s=new Scanner (System.in);
		 
		  System.out.print("Enter the Value of A is : ");
		  int a=s.nextInt();
		  
		  System.out.print("Enter the Value of B is : ");
		  int b=s.nextInt();
		  
		  a=b;   // Value of b is assigned to a
		  System.out.println("The Value of A when performed A=B is : "+a);
		  
		  a+=b;  // Value of a+b is assigned to a
		  System.out.println("The Value of A when performed A+=B is : "+a);
		  
		  a-=b;  // Value of a-b is assigned to a
		  System.out.println("The Value of A when performed A-=B is : "+a);
		  
		  a*=b;  // Value of a*b is assigned to a
		  System.out.println("The Value of A when performed A*=B is : "+a);
			
		  a/=b;  // Value of a/b is assigned to a
		  System.out.println("The Value of A when performed A/=B is : "+a);
		  
		  a%=b;  // Value of a%b is assigned to a
		  System.out.println("The Value of A when performed A%=B is : "+a);
		  	  
		  s.close();
		  
	}

}
