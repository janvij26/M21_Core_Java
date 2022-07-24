package com.tns.strings;

// A Program on StringBuffer in Java.

public class String_Buffer {

	public static void main(String[] args) 
	{
		/* Using capacity() Method to get 
		the Capacity of NULL string value.
		So the Capacity of null string is: 16 (by Default*/
		
		StringBuffer s = new StringBuffer("");
		System.out.println(s.capacity());
		
		// Printing the String Passed in StringBuffer.
		StringBuffer s1 = new StringBuffer("Janvi");
		System.out.println(s1);
		
		/* Using the length() method to get the length of String
		 * And then using the capacity() method on the length variable 
		 * we get the length printed instead of capacity because 
		 * here sb variable takes the value of length
		 */
		String s2 = "Today";
		StringBuffer sb = new StringBuffer(s2.length());
		System.out.println(sb.capacity());
		
		/* The below printing statement will show error because 
		 * the string passed here is in string type and 
		 * String Type is non-mutable.
		 */
		
		//System.out.println(s2.capacity());
		
		//
		StringBuffer buff = new StringBuffer("Internet of things");
		System.out.println(buff.capacity());
		
		//
		buff = new StringBuffer(" ");
		System.out.println(buff.capacity());
		
		//
		StringBuffer sb1 = new StringBuffer("Good ");
		sb1.append("Job");
		System.out.println(sb1);
		
		//
		StringBuffer sb2 = new StringBuffer("Jeva");
		System.out.println(sb2);
		System.out.println(sb2.charAt(1));
		sb2.setCharAt(1, 'a');
		System.out.println(sb2);
		System.out.println(sb2.charAt(1));
		
		//
		/*
		StringBuffer sb3 = new StringBuffer("Try");
		System.out.println(sb3);
		sb3.setCharAt(3,'x');
		System.out.println(sb3);
		*/

	}

}
