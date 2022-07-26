package com.tns.exception;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		/* If any Exception will occur in a try block
		that exception will be handled by catch block
		*/
		try
		{
			int res=15/x;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		
		s.close();
	}

}
