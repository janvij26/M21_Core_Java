package com.tns.e_n_u_m;
enum Bike
{
	Pulsar, Duke, R15, KTM, Shine;
}

public class Enum_with_Switch_Case {

	public static void main(String[] args) {
		Bike b = Bike.Shine;
		switch(b)
		{
		case Pulsar:
			System.out.println("Bike is Pulsar......!");
			break;
		
		case Duke:
			System.out.println("Bike is Duke......!");
			break;
			
		case R15:
			System.out.println("Bike is R15......!");
			break;
			
		case KTM:
			System.out.println("Bike is KTM......!");
			break;
			
		default:
			System.out.println("Invalid Bike Name");
			
		}	
	}

}
