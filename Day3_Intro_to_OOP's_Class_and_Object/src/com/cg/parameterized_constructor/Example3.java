package com.cg.parameterized_constructor;

class C
{
	int roll_no;
	String name;
	C(int roll_no,String name)
	{
		roll_no=roll_no;
		name=name;
	}
}



public class Example3 {

	public static void main(String[] args) {
		C obj =new C(11,"janvi");
		C obj1=new C(12,"Siddhant");

	}

}
