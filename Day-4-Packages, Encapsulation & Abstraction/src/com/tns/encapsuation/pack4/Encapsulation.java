package com.tns.encapsuation.pack4;

import com.tns.encapsulation.pack3.HDFC;

public class Encapsulation {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setATM_PIN(1526);
		System.out.println("The ATM PIN is : "+h.getATM_PIN());

	}

}
