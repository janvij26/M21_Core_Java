 package com.tns.this_keyword;
//1. this keyword is used to refer the instance variable of current class
class Fruit
{
	private String str;
	private String str1;
	void accept(String str,String str1)
	{
		this.str=str;
		this.str1=str1;
	}
	void display()
	{
		System.out.println("The first string is: "+str);
		System.out.println("The second string is: "+str1);

	}
}
public class Instance_Variable {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.accept("Parag", "Rohan");
		f.display();

	}

}