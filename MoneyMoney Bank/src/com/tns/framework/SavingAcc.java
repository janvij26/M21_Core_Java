package com.tns.framework;

public abstract class SavingAcc extends BankAcc 
{
	// Fields
	// 1. isSalaried
	private boolean isSalaried;
	@SuppressWarnings("unused")
	
	// 2. MINBAL
	static final private float MINBAL=0.0f; 
	
	/****************************************************************************/
	
	// Constructor
	public SavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		super (AccNo, AccNm, AccBal);
		this.isSalaried=isSalaried;
	}
	
	/****************************************************************************/
	
	// Methods
	// 1. withdraw
	@Override
	public void withdraw(float AccBal)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Account Balance is: "+(AccBal));
	}
	
	// 2. ToString
	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}

}