package com.bridgeLabz.creational.factoryPattern;

public class StaticBlockinitilization {
	private static StaticBlockinitilization obj;
	static
	{
		try
		{
			obj = new StaticBlockinitilization();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static StaticBlockinitilization getObj()
	{
		return obj;
	}
}
