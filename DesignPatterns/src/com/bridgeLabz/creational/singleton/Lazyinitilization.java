package com.bridgeLabz.creational.singleton;

/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Lazy initilization Stratagy
 * Date - 03/11/2019
 */
public class Lazyinitilization {
	private static Lazyinitilization obj;
	private Lazyinitilization() {
		System.out.println("Lazy Instance created");
	}
	
	public static Lazyinitilization getObj()
	{
		if(obj==null)
		{
			obj = new Lazyinitilization();
		}
		return obj;
	}
}
