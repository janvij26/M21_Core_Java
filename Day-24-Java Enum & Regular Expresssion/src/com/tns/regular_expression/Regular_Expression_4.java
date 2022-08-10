package com.tns.regular_expression;

import java.util.Scanner;

public class Regular_Expression_4 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner s=new Scanner(System.in);
		String str="Batch 21 CG \r\n Sid \r\n Janvi";
		
		
		String[] res=str.split("\\r?\\n");
		
		for(String i:res)
		{
			System.out.println(i);
		}
		
		

	}

}