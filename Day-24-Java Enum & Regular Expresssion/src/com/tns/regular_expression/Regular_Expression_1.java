package com.tns.regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regular_Expression_1 {

	public static void main(String[] args) {
		String pattern="Siddhant Rajigare";
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);

	}

}