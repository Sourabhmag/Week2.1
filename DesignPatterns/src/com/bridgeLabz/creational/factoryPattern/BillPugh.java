package com.bridgeLabz.creational.factoryPattern;

public class BillPugh {
	private static class SingletonHelper
	{
		private static final BillPugh obj = new BillPugh();
	}
	public static BillPugh getObj()
	{
		return SingletonHelper.obj;
	}
}
