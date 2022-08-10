package com.tns.lambda_expression;
//functional Interface
interface A
{
	//Zero-parameter abstract method
	void show();
}
/*class B implements A
{
	@Override
	public void show() {
		System.out.println("Program on to implement Functional interface using lambda expression");
		
	}
	
}*/
public class Functional_Interface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		//Lambda Expression
		A obj=()->
		{
			System.out.println("Program on to implement Functional interface using lambda expression");
		};
		obj.show();

	}

}