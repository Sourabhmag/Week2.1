package com.bridgeLabz.behavioral.facade;

public class BlackBerry implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Blackberry Z10");
	}

	@Override
	public void price() {
		System.out.println("Rs.10000");
	}
	
}
