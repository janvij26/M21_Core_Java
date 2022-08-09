package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{	
	// Fields
	// Credit-Limit
	private final float creditLimit;
	
	/****************************************************************************/
	
	// Constructor 
	public CurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) 
	{
		super(AccNo, AccNm, AccBal);
		this.creditLimit=creditLimit;
	}
	
	/****************************************************************************/
	
	// Providing Implementation to Abstract Method of Bank Account here Current Account
	// 1. withdraw
	@Override
	public void withdraw(float AccBal)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Balance is: "+(AccBal + creditLimit));	
	}

	// 2. ToString 
	@Override
	public String toString() 
	{
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	
}