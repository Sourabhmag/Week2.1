package com.bridgeLabz.objectOrientedPrograms;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Acts as stock account manager
 * Date - 30/10/2019
 */
public class StockAccountController {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		StockAccount abc = new StockAccount();
		System.out.println(
				"Enter your choice\n1)Create New Account\n2)Buy Share\n3)Sell Share\n4)Print "
				+ "Net Worth\n5)Exit");
		int choice = Util.readInt();
		switch (choice) {
		case 1:
			//Create new account
			abc.stockAccount();
			main(args);
			break;
		case 2: {
			//Buy stocks
			System.out.println("Enter amount");
			int amount = Util.readInt();
			System.out.println("Enter symbol");
			String symbol = Util.readString();
			abc.buy(amount, symbol);
			abc.printReport();
			main(args);
			break;
		}
		case 3:
			//Sell stocks
			System.out.println("Enter amount");
			int amount = Util.readInt();
			System.out.println("Enter symbol");
			String symbol = Util.readString();
			abc.sell(amount, symbol);
			abc.printReport();
			main(args);
			break;
		case 4:
			//Calculate net worth of account holder
			System.out.println("$" + abc.valueOf());
			main(args);
			break;
		
		case 5: System.exit(0);
		default:main(args);
		}
	}
}