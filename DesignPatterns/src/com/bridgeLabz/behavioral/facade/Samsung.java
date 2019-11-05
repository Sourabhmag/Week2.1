package com.bridgeLabz.behavioral.facade;

public class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Galaxy s8");
	}

	@Override
	public void price() {
		System.out.println("Rs.40000");
		
	}

}
