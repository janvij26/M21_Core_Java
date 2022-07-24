package com.tns.strings;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) 
	{
		
		//
		StringTokenizer s=new StringTokenizer("Lets try this");
		System.out.println(s.nextToken());
		//System.out.println(s.nextToken());
		//System.out.println(s.nextToken());
		
		//
		StringTokenizer st = new StringTokenizer("Lets try this");
		while(st.hasMoreTokens()) 
		{
		System.out.println(st.nextToken());
		}
		
		//
		StringTokenizer st1 = new 
		StringTokenizer("Let,s,try,this",",");
		while (st1.hasMoreTokens()) 
		{
				System.out.println(st1.nextToken());
		}
		
		//
		StringTokenizer st2 =new StringTokenizer("JAVA:Code:String", ":", true);
		while (st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());	
		}
		
		//
		StringTokenizer st3 = new StringTokenizer("JAVA:Code:String", ":", false);
		while (st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}

				
		
	}
}
