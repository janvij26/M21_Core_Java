package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc 
{
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges=0.0f; 
	
	// Constructor
	public PrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		super (AccNo, accNm, charges);
		this.isPrime=isPrime;
	}	
	
	// Method
	public void bookProduct(float charges)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccName());
		System.out.println("Charges are: "+(charges));
		
	}
	
	// ToString Method
	@Override
	public String toString() 
	{
		return String.format("PrimeAcc [isPrime=%s]", isPrime);
	}

}
