package com.tns.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generics_Map_Class {

	public static void main(String[] args) 
	{
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(1, "Janvi");
		m.put(2, "Siddhant");
		System.out.println(m);
		
		Set<Map.Entry<Integer, String>>itr=m.entrySet();
		
		Iterator<Map.Entry<Integer, String>>itr1=itr.iterator();

		while(itr1.hasNext())
		{
			// Type-Casting is not required
			@SuppressWarnings("rawtypes")
			Map.Entry e=itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
