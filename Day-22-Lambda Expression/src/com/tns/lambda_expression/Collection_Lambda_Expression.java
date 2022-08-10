package com.tns.lambda_expression;
//program on lambda expression in terms of Generics and Collection
import java.util.LinkedList;

public class Collection_Lambda_Expression {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		System.out.println(obj);
		//Lambda Expression
		obj.forEach((i)->
		{
			System.out.println(i);
		});


	}

}