package com.tns.array;

class Employee
{
	public int EmpId;
	public String Name;
	
	// Constructor ti initialize the value
	Employee(int id, String name)
	{
		EmpId=id;
		Name=name;
	}
}

public class NonPrimitiveArray {

	public static void main(String[] args) 
	{
		// Declare Array of class type
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(15,"Siddhant");
		arr[1]=new Employee(26,"Janvi");
		arr[2]=new Employee(12,"Sid");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Element at "+i+"st"+ " Index is: "+arr[i].EmpId+" "+arr[i].Name);
		}
		

	}

}
