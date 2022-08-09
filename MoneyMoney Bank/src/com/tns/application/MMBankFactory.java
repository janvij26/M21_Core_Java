package com.tns.application;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;

public class MMBankFactory extends BankFactory 
{
	// Methods
	
	// 1. For Saving Account
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		MMSavingAcc s=new MMSavingAcc(AccNo, AccNm, AccBal, isSalaried);
		return s;
	}

	// 2. For Current Account
	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit ) 
	{
		MMCurrentAcc c=new MMCurrentAcc(AccNo, AccNm, AccBal, creditLimit);
		return c;
	}

}
