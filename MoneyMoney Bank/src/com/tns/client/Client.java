package com.tns.client;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankFactory;

public class Client {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(122921, "Janvi" , 30000, true);
		CurrentAcc c=new MMCurrentAcc(122321, "Sid", 150000, 60);
		
		// For Prime Account Output
		System.out.println("Saving Account: ");	
		s.withdraw(s.getAccBal());
		System.out.println(s);
		
		System.out.println();
		
		// For Normal Account Output
		System.out.println("Current Account: ");
		c.withdraw(c.getAccBal());
		System.out.println(c);
	}

}
