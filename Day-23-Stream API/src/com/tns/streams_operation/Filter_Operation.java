package com.tns.streams_operation;

import java.util.Arrays;
import java.util.List;

public class Filter_Operation {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f, 15.26f);
		// System.out.println(obj);
		// Filtering with condition : filter(predicate)
		obj.stream().filter(i->i>15.2f).forEach(System.out::println);

	}

}
