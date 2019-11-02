package com.bridgeLabz.AddressBook.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgeLabz.AddressBook.model.Person;
import com.bridgeLabz.AddressBook.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to manage all operations of person
 * Date - 02/11/2019
 */
public class PersonData {

	static String path1 = "/home/user/eclipse-workspace/AddressBook/src/com/bridgeLabz/AddressBook/repository/";

	/**
	 * @Purpose - used to create new address book
	 */
	public static void createNewAddressBook()
	{
		System.out.println("Already existing Address book is open,still want to create new one press 2 \n"
				+ "to open existing one press 1");
		int choice = Util.readInt();
		switch(choice)
		{
		case 1:
			try {
				System.out.println("Enter bookname");
				displayData(Util.readString());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Enter address book is not present");
			}
		case 2:
		{
			try {
				List<Person> list = new ArrayList<Person>();
				System.out.println("Enter name of new address book");
				String path = "/home/user/eclipse-workspace/AddressBook/src/com/bridgeLabz/AddressBook/repository/"
						+Util.readString() +".json";
				Util.writePerson(path, list);
				System.out.println("New Address book is created");
				break;
			}
			catch(Exception e)
			{
				System.out.println("Enter address book is not present");
			}
			
		}
		default:
		{
			System.out.println("Enter correct choice");
			createNewAddressBook();
		}
		}
	}
	/**
	 * @Purpose - Used to add person in address book
	 * @param bookname
	 */
	public static void add(String bookname) {
		String path = path1+bookname+".json";
		Person person = new Person();

		System.out.println("Enter First name");
		person.setFirstname(Util.readString());

		System.out.println("Enter last name");
		person.setLastname(Util.readString());

		System.out.println("Enter address");
		person.setAddress(Util.readString());

		System.out.println("Enter city");
		person.setCity(Util.readString());

		System.out.println("Enter state");
		person.setState(Util.readString());

		System.out.println("Enter zip");
		person.setZip(Util.readInt());

		System.out.println("Enter phone number");
		person.setPhone(Util.readString());

		try {
			List<Person> list = Util.readPerson(path);
			list.add(person);
			Util.writePerson(path, list);
			System.out.println("Person added successfully");
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
	}
	/**
	 * @Purpose - Used to search person in address book
	 * @param bookname
	 */
	public static boolean search(String bookname,String FirstName, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			List<Person> list = list_of_persons.stream()
					.filter(i -> i.getFirstname().equals(FirstName) && i.getLastname().equals(LastName))
					.collect(Collectors.toList());
			if (list.isEmpty() == false)
				return true;
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		return false;
		
	}
	/**
	 * @Purpose - Used to delete person in address book
	 * @param bookname
	 */
	public static boolean delete(String bookname,String FirstName, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(FirstName) && i.getLastname().equals(LastName)) {
					list_of_persons.remove(i);
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		
		return false;
	}
	/**
	 * @Purpose - Used to edit details of person in address book
	 * @param bookname
	 */
	public static void edit() {
		System.out.println(
				"Enter your choice\n1)Edit Address\n2)Edit City\n3)Edit State\n4)Edit Zip\n5)Edit Phone Number");
		int choice = Util.readInt();
		System.out.println("Enter persons First name");
		String Firstname = Util.readString();
		System.out.println("Enter Last Name");
		String LastName = Util.readString();
		System.out.println("Enter book name");
		String bookname = Util.readString();
		
		if (search(bookname,Firstname, LastName)) {
			switch (choice) {
			case 1:
				if (editAddress(bookname,Firstname, LastName))
					System.out.println("Address edited successfully");
				else
					System.out.println("Enter person not found in Address Book");
				break;
			case 2:
				if (editCity(bookname,Firstname, LastName))
					System.out.println("City edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 3:
				if (editState(bookname,Firstname, LastName))
					System.out.println("State edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 4:
				if (editZip(bookname,Firstname, LastName))
					System.out.println("Zip edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 6:
				if (editPhone(bookname,Firstname, LastName))
					System.out.println("Phone number edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			default:
				edit();
			}
		} else
			System.out.println("Person not found");
	}
	/**
	 * @Purpose - Used to edit address of person in address book
	 * @param bookname
	 */
	public static boolean editAddress(String bookname,String Firstname, String LastName) {
		
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName)) {
					System.out.println("Enter new Address");
					i.setAddress(Util.readString());
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		return false;
	}
	/**
	 * @Purpose - Used to edit city of person in address book
	 * @param bookname
	 */
	public static boolean editCity(String bookname,String Firstname, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName)) {
					System.out.println("Enter new City");
					i.setCity(Util.readString());
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		
		return false;
	}
	/**
	 * @Purpose - Used to edit state of person in address book
	 * @param bookname
	 */
	public static boolean editState(String bookname,String Firstname, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName)) {
					System.out.println("Enter new State");
					i.setState(Util.readString());
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		
		return false;
	}
	/**
	 * @Purpose - Used to edit zip of person in address book
	 * @param bookname
	 */
	public static boolean editZip(String bookname,String Firstname, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName)) {
					System.out.println("Enter new Zip");
					i.setZip(Util.readInt());
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		
		return false;
	}
	/**
	 * @Purpose - Used to edit phone of person in address book
	 * @param bookname
	 */
	public static boolean editPhone(String bookname,String Firstname, String LastName) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				if (i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName)) {
					System.out.println("Enter new Phone number");
					i.setPhone(Util.readString());
					Util.writePerson(path, list_of_persons);
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		return false;
	}
	/**
	 * @Purpose - Used to swap data
	 * @param bookname
	 */
	public static void swap(String bookname,int i, int j) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			List<Person> list = new ArrayList<Person>();
			list.add(list_of_persons.get(i));
			list_of_persons.set(i, list_of_persons.get(j));
			list_of_persons.set(j, list.get(0));
			list.remove(0);
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
	}
	/**
	 * @Purpose - Used to sort data by name
	 * @param bookname
	 */
	public static void sortByName(String bookname) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (int i = 0; i < list_of_persons.size()-1; i++) {
				for (int j = 0; j < list_of_persons.size()-1; j++) {
					if (list_of_persons.get(j).getLastname().compareTo(list_of_persons.get(j+1).getLastname()) == 0) {
						if (list_of_persons.get(j).getFirstname().compareTo(list_of_persons.get(j+1).getFirstname()) == 0) {
							if (list_of_persons.get(j).getZip() > (list_of_persons.get(j+1).getZip())) {
								swap(bookname,j,j+1);
							}
						} else {
							if (list_of_persons.get(j).getFirstname()
									.compareTo(list_of_persons.get(j+1).getFirstname()) > 0) {
								swap(bookname,j,j+1);
							}
						}
					} else {
						if (list_of_persons.get(j).getLastname().compareTo(list_of_persons.get(j+1).getLastname()) > 0) {
							swap(bookname,j,j+1);
						}
					}
				}
			}
			for (Person person : list_of_persons) {
				System.out.println(person.getFirstname() + " " + person.getLastname()+" "+person.getZip());
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
	}
	/**
	 * @Purpose - Used to sort data by zip
	 * @param bookname
	 */
	public static void sortByZip(String bookname) {
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (int i = 0; i < list_of_persons.size()-1; i++) {
				for (int j = 0; j < list_of_persons.size()-1; j++) {
					if (list_of_persons.get(j).getZip() == (list_of_persons.get(j+1).getZip())) {
						if (list_of_persons.get(j).getLastname().compareTo(list_of_persons.get(j+1).getLastname()) == 0) {
							if (list_of_persons.get(j).getFirstname().compareTo(list_of_persons.get(j+1).getFirstname()) > 0) {
								swap(bookname,j,j+1);
							}
						} else {
							if (list_of_persons.get(j).getLastname()
									.compareTo(list_of_persons.get(j+1).getLastname()) > 0) {
								swap(bookname,j,j+1);
							}
						}
					} else {
						if (list_of_persons.get(j).getZip() > (list_of_persons.get(j+1).getZip())){
							swap(bookname,j,j+1);
						}
					}
				}
			}
			for (Person person : list_of_persons) {
				System.out.println(person.getFirstname() + " " + person.getLastname()+" "+person.getZip());
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
		
	}
	/**
	 * @Purpose - Used to sort data
	 * @param bookname
	 */
	public static void displayData(String bookname)
	{
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			for (Person i : list_of_persons) {
				System.out.println("Name :"+i.getFirstname()+" "+i.getLastname());
				System.out.println("Address :"+i.getAddress());
				System.out.println("City :"+i.getCity());
				System.out.println("State :"+i.getState());
				System.out.println("Zip code :"+i.getZip());
				System.out.println("-----------------------------");
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
	}
	/**
	 * @Purpose - Used to save data
	 * @param bookname
	 */
	public static void save(String bookname)
	{
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			Util.writePerson(path, list_of_persons);
			System.out.println("Data saved");
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
	}
	/**
	 * @Purpose - Used to save data in different file
	 * @param bookname
	 */
	public static void saveAs(String bookname)
	{
		try {
			String path = path1+bookname+".json";
			List<Person> list_of_persons = Util.readPerson(path);
			System.out.println("Enter new name");
			String newName = Util.readString();
			path = path1+newName+".json";
			Util.writePerson(path, list_of_persons);
			System.out.println(newName +" is created and data has been saved");
		}
		catch(Exception e)
		{
			System.out.println("Enter address book is not present");
		}
		
	}
	/**
	 * @Purpose - Used to display names of all address books
	 * @param bookname
	 */
	public static void displayNames()
	{
		File folder = new File(path1);
		File[] listOfFiles = folder.listFiles();
		System.out.println("List of existing address books ");
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println(listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}
		System.out.println();
	}
}
