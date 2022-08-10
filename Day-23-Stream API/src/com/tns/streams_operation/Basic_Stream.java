package com.tns.streams_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic_Stream {

	public static void main(String[] args) {
		// Stream can be created with static data
		Stream<String> s=Stream.of("Janvi","Sid");
		s.forEach((i)->System.out.print(i+" "));
		System.out.println();
		
		// Stream can be acquired from array or collections 
		List<String>s1=Arrays.asList(new String[] {"Pune", "Kolhapur"});
		s=s1.stream();
		//s.forEach((i)->System.out.print(i));
		s.forEach(System.out::println);
	}

}
