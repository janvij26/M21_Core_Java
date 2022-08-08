package com.tns.this_keyword;
//2.this keyword can be passes as an argument in the constructor call
class A
{
	public int a;
	/*A()
	{
		
	}*/
	A(int a)
	{
		this.a=a;
	}
}
public class Constructor_Argument {

	public static void main(String[] args) {
		A obj=new A(5);
		System.out.println("The value of a is: "+obj.a);
		

	}

}
