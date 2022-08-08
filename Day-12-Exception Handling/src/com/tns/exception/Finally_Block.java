package com.tns.exception;

import java.util.Scanner;

public class Finally_Block {

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
		finally
		{
			System.out.println("Whether Any Exception occur or not, the finally block will always Execute");
		}
		
		s.close();

	}

}
