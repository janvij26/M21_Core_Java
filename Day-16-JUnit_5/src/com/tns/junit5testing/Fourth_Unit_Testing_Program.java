package com.tns.junit5testing;

// Program on Assertion
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class Fourth_Unit_Testing_Program 
{
	@Test
	void function()
	{
		int arr[]= {1,2,3,4,5};
		// assertEquals Method will check whether the two parameters
		// value are same or not
		// If it is same then you will not get any failures otherwise
		// you will get failures
		assertAll("arr",()->assertEquals(arr[3],4),
						()->assertEquals(arr[2],3));
		//System.out.println("Want to Display a Name");
	}

}
