package com.tns.list;

import java.util.ArrayList;

public class Clone_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add("Siddhant");
		obj.add("Rajiagre");
		obj.add("512");
		System.out.println(obj);
		// Shallow Copy of ArrayList
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);

	}

}
