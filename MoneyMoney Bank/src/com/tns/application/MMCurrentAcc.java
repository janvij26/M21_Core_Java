package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	// Fields
	// Fields are Inherited for the CurrentAcc Class as we have Extended. 
		
	/*********************************************************************************/
	
	// Constructor
	public MMCurrentAcc(int AccNo, String AccNm, float charges, float deliveryCharges) 
	{
		super(AccNo, AccNm, charges, deliveryCharges);
	}
	
	/*********************************************************************************/

	// Methods
	
	// 1. withdraw 
	// withdraw method is inherited from CurrentAcc Class
	
	// 2. ToString Method
	@Override
	public String toString() 
	{
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}
	
}
