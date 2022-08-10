package com.tns.framework;

public abstract class ShopFactory 
{
	// Abstract Method
	abstract public PrimeAcc getNewPrimeAcc (int AccNo, String AccNm, float charges, boolean isPrime);
	abstract public NormalAcc getNewNormalAcc (int AccNo, String AccNm, float charges, float deliverCharges);

}
