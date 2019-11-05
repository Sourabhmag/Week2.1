package com.bridgeLabz.creational.singleton;

/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Thread safe initilization Stratagy
 * Date - 03/11/2019
 */
public class ThreadsafeSingleton {
	private static ThreadsafeSingleton obj;
	private ThreadsafeSingleton() {
		System.out.println("Thread safe Instance created");
	}
	public static synchronized ThreadsafeSingleton getObj()
	{
		if(obj==null)
		{
			obj = new ThreadsafeSingleton();
		}
		return obj;
	}
}
