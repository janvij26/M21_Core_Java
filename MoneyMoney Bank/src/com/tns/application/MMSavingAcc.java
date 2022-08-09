package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	// Fields
	// Fields are Inherited for the SavingAcc Class as we have Extended. 
	
	/****************************************************************************/
	
	// Constructor
	public MMSavingAcc(int AccNo, String AccNm, float AccBal, boolean isPrime) 
	{
		super(AccNo, AccNm, AccBal, isPrime);
	}

	/****************************************************************************/
	
	// Methods
	// 1. withdraw 
	// withdraw method is inherited from SavingAcc Class
	
	// 2. ToString 
	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}
		
}