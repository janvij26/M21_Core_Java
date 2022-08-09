package com.tns.framework;

public abstract class BankFactory 
{
	// Abstract Methods
	
	// 1. For Saving Account
	abstract public SavingAcc getNewSavingAcc (int AccNo, String AccNm, float AccBal, boolean isSalaried);
	
	// 2. For Current Account
	abstract public CurrentAcc getNewCurrentAcc (int AccNo, String AccNm, float AccBal, float creditLimit);

}