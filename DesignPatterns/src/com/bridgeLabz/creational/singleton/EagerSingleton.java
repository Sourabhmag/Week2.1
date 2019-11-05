package com.bridgeLabz.creational.singleton;

/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Eager Stratagy
 * Date - 03/11/2019
 */
public class EagerSingleton {
	// Object obj is created 
	private static EagerSingleton obj = new EagerSingleton();

	private EagerSingleton() {
		System.out.println("Eager Instance created");
	}

	public static EagerSingleton getObj() {
		return obj;
	}
}
