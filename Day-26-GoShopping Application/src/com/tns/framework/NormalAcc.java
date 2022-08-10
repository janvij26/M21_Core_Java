package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{	
	// Fields
	private final float deliveryCharges;
	
	// Constructor 
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	
	// Providing Implementation to abstract method of shop account here
	// Normal Account
	public void bookProduct(float charges)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccName());
		System.out.println("Charges are: "+(charges+deliveryCharges));
	}

	// ToString Method
	@Override
	public String toString() 
	{
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}
	
	
}
