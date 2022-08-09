package com.tns.framework;

public abstract class BankAcc 
{
	// Fields
	// 1. Account no.
	private int AccNo;
	
	// 2. Account Name
	private String AccNm;
	
	// 3. Account Balance
	private float AccBal;
	
	// Getters and Setters Method for Private Variables
	public int getAccNo() 
	{
		return AccNo;
	}
	public void setAccNo(int AccNo) 
	{
		this.AccNo = AccNo;
	}

	public String getAccNm() 
	{
		return AccNm;
	}
	public void setAccNm(String AccNm) 
	{
		this.AccNm = AccNm;
	}

	public float getAccBal() 
	{
		return AccBal;
	}
	public void setAccBal(float AccBal) 
	{
		this.AccBal = AccBal;
	}	
	
	/**********************************************************************************************/
	
	// Constructor
	public BankAcc(int AccNo, String AccNm, float AccBal) 
	{
		super();
		this.AccNo = AccNo;
		this.AccNm = AccNm;
		this.AccBal = AccBal;
	}
	
	/**********************************************************************************************/
	
	// Methods
	// 1. Abstract Method withdraw
	abstract public void withdraw(float AccBal);
	
	// 2. Items Method
	public void deposite(float AccBal)
	{
		System.out.println(AccBal);
	}
		
	//3. ToString Method
	@Override
	public String toString() 
	{
		return String.format("BankAcc [AccNo=%s, AccNm=%s, AccBal=%s]", AccNo, AccNm, AccBal);
	}	
	
}
