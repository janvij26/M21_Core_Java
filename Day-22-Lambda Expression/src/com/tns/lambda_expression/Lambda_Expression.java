package com.tns.lambda_expression;
//functional interface
interface C
{
	int add(int a,int b);
}
public class Lambda_Expression {

	public static void main(String[] args) {
		//lambda expression without returning a value
		C obj=(int a,int b)->(a*b);
		System.out.println("Multiplication od A and B is : "+obj.add(13, 5));
	}

}