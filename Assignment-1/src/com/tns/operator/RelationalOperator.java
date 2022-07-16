package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  int a=s.nextInt();
	  int b=s.nextInt();
	  
	  boolean result_1=a>b; 
	  System.out.println(result_1);
	  
	  boolean result_2=a<b;
	  System.out.println(result_2);
	  
	  boolean result_3=a>=b;
	  System.out.println(result_3);
	  
	  boolean result_4=a<=b;
	  System.out.println(result_4);
	  
	  boolean result_5=a!=b;
	  System.out.println(result_5);
	  
	  boolean result_6=(a==b);
	  
	  System.out.println(result_6);
	  s.close();
	}

}
