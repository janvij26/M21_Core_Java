package com.tns.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generic_Class2 {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(1, "Parag");
		obj.put(2, "Ashlesha");
		System.out.println(obj);
		
		Set<Map.Entry<Integer,String>>itr=obj.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1=itr.iterator();
		
		while(itr1.hasNext())
		{
			//type-casting is not required
			@SuppressWarnings("rawtypes")
			Map.Entry e=itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}