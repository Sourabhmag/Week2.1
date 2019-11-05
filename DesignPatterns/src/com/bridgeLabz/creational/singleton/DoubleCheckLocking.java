package com.bridgeLabz.creational.singleton;

/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Double Check Locking initilization Stratagy
 * Date - 03/11/2019
 */
public class DoubleCheckLocking {
	private static DoubleCheckLocking obj;
	private DoubleCheckLocking() {
		System.out.println("Double check locking Instance created");
	}
	public static DoubleCheckLocking getObj()
	{
		if(obj==null)
		{
			synchronized (DoubleCheckLocking.class) {
				if(obj==null)
				{
					obj = new DoubleCheckLocking();
				}
			}
		}
		return obj;
	}
	
}
