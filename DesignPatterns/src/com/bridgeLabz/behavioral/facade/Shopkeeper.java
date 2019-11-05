package com.bridgeLabz.behavioral.facade;

public class Shopkeeper {
	private MobileShop iphone= new Iphone();
	private MobileShop samsung  = new Samsung();
	private MobileShop blackberry= new BlackBerry();
	
	public void iphoneSale()
	{
		iphone.modelNo();
		iphone.price();
	}
	
	public void samsungSale()
	{
		samsung.modelNo();
		samsung.price();
	}
	
	public void blackberrySale()
	{
		blackberry.modelNo();
		blackberry.price();
	}
}
