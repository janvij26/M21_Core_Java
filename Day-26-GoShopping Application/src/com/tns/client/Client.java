package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(122921, "Janvi" , 300, true);
		NormalAcc n=new GSNormalAcc(122321, "Sid", 750, 50);
		
		// For Prime Account Output
		System.out.println("Prime Account: ");	
		p.bookProduct(p.getCharges());
		System.out.println(p);
		
		System.out.println();
		
		// For Normal Account Output
		System.out.println("Normal Account: ");
		n.bookProduct(n.getCharges());
		System.out.println(n);
	}

}
