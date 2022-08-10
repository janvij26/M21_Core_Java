package com.tns.annotations;

class A
{
	// It allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to C2TC");
	}
}

public class Deprecated_Annotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
