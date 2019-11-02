package com.bridgeLabz.creational.factoryPattern;

public class ThreadsafeSingleton {
	private static ThreadsafeSingleton obj;
	public static synchronized ThreadsafeSingleton getObj()
	{
		if(obj==null)
		{
			obj = new ThreadsafeSingleton();
		}
		return obj;
	}
}
