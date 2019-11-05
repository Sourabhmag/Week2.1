package com.bridgeLabz.creational.singleton;

/**
 * @author Sourabh Magdum
 * @Purpose -  To check how singleton works with Bill Pugh initilization Stratagy
 * Date - 03/11/2019
 */
public class BillPugh {
	private BillPugh(){
		System.out.println("BillPugh instance created");
	}
	private static class SingletonHelper
	{
		private static final BillPugh obj = new BillPugh();
	}
	public static BillPugh getObj()
	{
		return SingletonHelper.obj;
	}
}
