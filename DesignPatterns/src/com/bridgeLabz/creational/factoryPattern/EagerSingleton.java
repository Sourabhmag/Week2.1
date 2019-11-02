package com.bridgeLabz.creational.factoryPattern;

public class EagerSingleton {

	private static EagerSingleton obj = new EagerSingleton();
	public static EagerSingleton getObj()
	{
		return obj;
	}

}
