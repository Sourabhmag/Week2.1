package com.bridgeLabz.behavioral.facade;

import utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Controller Class for Facade Pattern
 * Date - 05/11/2019
 */
public class Controller {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		System.out.println("1)iphone");
		System.out.println("2)Samsung");
		System.out.println("3)BlackBerry");
		System.out.println("4)Exit");
		int choice = Util.readInt();
		Shopkeeper shopkeeper = new Shopkeeper();
		switch(choice)
		{
		case 1: 
			shopkeeper.iphoneSale();
			main(args);
			break;
		case 2:
			shopkeeper.samsungSale();
			main(args);
			break;
		case 3:
			shopkeeper.blackberrySale();
			main(args);
			break;
		case 4:
			System.exit(0);
			break;
		default:main(args);
		}
	}

}
