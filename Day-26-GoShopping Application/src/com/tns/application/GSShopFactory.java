package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc p=new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc n=new GSNormalAcc(AccNo, accNm, charges, deliveryCharges);
		return n;
	}

}
