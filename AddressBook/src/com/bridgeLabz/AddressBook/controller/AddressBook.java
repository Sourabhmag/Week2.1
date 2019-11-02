package com.bridgeLabz.AddressBook.controller;

import com.bridgeLabz.AddressBook.service.PersonData;
import com.bridgeLabz.AddressBook.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Controller class of address book application
 * Date - 02/11/2019
 */
public class AddressBook {

	public static void main(String[] args) {
		String bookname = "Enter book name";
		String nameOfBook, FirstName, LastName;
		System.out.println("Enter your choice");
		System.out.println("1)Create new Address Book");
		System.out.println("2)Display names of Existing Address Book");
		System.out.println("3)Add a person");
		System.out.println("4)Edit person");
		System.out.println("5)Remove Person");
		System.out.println("6)Sort by name");
		System.out.println("7)Sort by zip");
		System.out.println("8)Display Address book");
		System.out.println("9)Save");
		System.out.println("10)Save as");
		System.out.println("11)Exit");

		switch (Util.readInt()) {
		case 1:
			PersonData.createNewAddressBook();
			main(args);
			break;
		case 2:
			PersonData.displayNames();
			main(args);
			break;
		case 3:
			System.out.println(bookname);
			PersonData.add(Util.readString());
			main(args);
			break;
		case 4:
			PersonData.edit();
			main(args);
			break;
		case 5:
			System.out.println(bookname);
			nameOfBook = Util.readString();
			System.out.println("Enter First Name");
			FirstName = Util.readString();
			System.out.println("Enter Last name");
			LastName = Util.readString();
			PersonData.delete(nameOfBook, FirstName, LastName);
			main(args);
			break;
		case 6:
			System.out.println(bookname);
			PersonData.sortByName(Util.readString());
			main(args);
			break;
		case 7:
			System.out.println(bookname);
			PersonData.sortByZip(Util.readString());
			main(args);
			break;
		case 8:
			System.out.println(bookname);
			PersonData.displayData(Util.readString());
			main(args);
			break;
		case 9:
			System.out.println(bookname);
			PersonData.save(Util.readString());
			main(args);
			break;
		case 10:
			System.out.println(bookname);
			PersonData.saveAs(Util.readString());
			main(args);
			break;
		case 11:
			System.exit(0);
		default:
			main(args);
		}

	}

}
