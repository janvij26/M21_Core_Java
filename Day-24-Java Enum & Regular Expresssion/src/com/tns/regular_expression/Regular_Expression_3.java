package com.tns.regular_expression;

import java.util.regex.Pattern;

public class Regular_Expression_3 {

	public static void main(String[] args) {
		String str="I1love2Mumbai";
		String delimiter="\\d";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		
		for(String i:res)
		{
			System.out.println(i);
		}
		
		

	}

}