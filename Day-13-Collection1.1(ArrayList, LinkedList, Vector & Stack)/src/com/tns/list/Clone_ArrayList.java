package com.tns.list;

import java.util.ArrayList;

public class Clone_ArrayList {

	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		obj.add("Shiwani");
		obj.add(13);
		obj.add(15.30);
		obj.add("Shiwani");
		System.out.println(obj);
		
		//Shallow Copy of ArrayList
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);	

	}

}
