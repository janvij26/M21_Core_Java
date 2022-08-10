package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int AccNo, String AccNm, float charges, float deliveryCharges) 
	{
		super(AccNo, AccNm, charges, deliveryCharges);
	}

	// ToString Method
	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}
	
	

}
