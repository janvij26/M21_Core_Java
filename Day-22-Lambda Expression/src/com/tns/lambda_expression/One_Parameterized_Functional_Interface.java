package com.tns.lambda_expression;
//Functional Interface=which contains only one abstract method
interface B
{
	//One-Parameterized abstract method
	String print(String str);
}
public class One_Parameterized_Functional_Interface {

	public static void main(String[] args) {
		//Lambda Expresssion
		B obj=(String str)->
		{
			
			return str;
		};
		System.out.println(obj.print("Lambda Expresssion"));
		

	}

}