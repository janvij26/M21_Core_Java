package com.tns.this_keyword;
//3.this keyword can be passed as an argument in method call
class B
{
	void print(B b)
	{
		System.out.println("Fuction 1 is invoked");
	}
	void display()
	{
		print(this);
	}
}


public class Method_Call {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
