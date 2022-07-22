package com.tns.array;

public class CompileTime_Array {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		//System.out.println(arr[1]+" "+arr[2]);
		
		// Printing Array using For Loop
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
		
		// Enhanced For Loop
		for (int x:arr)
		{
			System.out.println(x+" ");
		}
	}

}
