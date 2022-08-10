package com.tns.streams_operation;

import java.util.LinkedList;

public class Collection_Lamda {

	public static void main(String[] args) 
	{
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(11);
		obj.add(12);
		System.out.println(obj);
		//obj.forEach(i->System.out.println(i));
		obj.forEach(System.out::println);
		/*for(Integer i:obj)
		{
			System.out.println(i);
		}*/
	}

}
