package com.tns.vector;

import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();
		//v.add(15);
		//v.add("Janvi");
		//v.add(65.6f);
		v.add(15, "Janvi");
		v.add(26, "Siddhant");
		System.out.println(v);

	}

}
