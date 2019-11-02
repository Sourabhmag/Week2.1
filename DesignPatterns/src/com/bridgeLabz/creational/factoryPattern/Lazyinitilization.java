package com.bridgeLabz.creational.factoryPattern;

public class Lazyinitilization {
	private static Lazyinitilization obj;
	public static Lazyinitilization getObj()
	{
		if(obj==null)
		{
			obj = new Lazyinitilization();
		}
		return obj;
	}
}
