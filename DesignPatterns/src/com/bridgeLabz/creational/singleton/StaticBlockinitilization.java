package com.bridgeLabz.creational.singleton;

public class StaticBlockinitilization {
	
	/**
	 * @author Sourabh Magdum
	 * @Purpose -  To check how singleton works with Static block Stratagy
	 * Date - 03/11/2019
	 */
	private static StaticBlockinitilization obj;
	private StaticBlockinitilization() {
		System.out.println("Static Block Instance created");
	}

	static {
		try {
			obj = new StaticBlockinitilization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockinitilization getObj() {
		return obj;
	}
}
