package com.bridgeLabz.AddressBook.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgeLabz.AddressBook.model.Person;
import com.bridgeLabz.AddressBook.utility.Util;

public class PersonData {
	
	static String path = "/home/user/eclipse-workspace/AddressBook/src/com/bridgeLabz/AddressBook/repository/person.json";
	private static List<Person> list_of_persons = Util.readPerson(path);
	public static void add()
	{
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
		
		List<Person> list = Util.readPerson(path);
		list.add(person);
		Util.writePerson(path, list);
		System.out.println("Person added successfully");
	}
	public static boolean search(String FirstName,String LastName)
	{
		List<Person> list_of_persons = Util.readPerson(path);
		List<Person>list = list_of_persons.stream().filter(i->i.getFirstname().equals(FirstName) && 
				i.getLastname().equals(LastName)).collect(Collectors.toList());
		if(list.isEmpty()==false)
			return true;
		return false;
	}
	public static boolean delete(String FirstName,String LastName)
	{
		List<Person> list_of_persons = Util.readPerson(path);
		for (Person i : list_of_persons) {
			if(i.getFirstname().equals(FirstName) && i.getLastname().equals(LastName))
			{
				list_of_persons.remove(i);
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
	public static void edit()
	{
		System.out.println("Enter your choice\n1)Edit Address\n2)Edit City\n3)Edit State\n4)Edit Zip\n5)Edit Phone Number");
		int choice = Util.readInt();
		System.out.println("Enter persons First name");
		String Firstname = Util.readString();
		System.out.println("Enter Last Name");
		String LastName = Util.readString();
		if(search(Firstname, LastName)) {
			switch(choice)
			{
			case 1: 
				if(editAddress(Firstname,LastName))
					System.out.println("Address edited successfully");
				else
					System.out.println("Enter person not found in Address Book");
				break;
			case 2: 
				if(editCity(Firstname,LastName))
					System.out.println("City edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 3: 
				if(editState(Firstname,LastName))
					System.out.println("State edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 4: 
				if(editZip(Firstname,LastName))
					System.out.println("Zip edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			case 6: 
				if(editPhone(Firstname,LastName))
					System.out.println("Phone number edited successfully");
				else
					System.out.println("Enter person not found in Address book");
				break;
			default:
				edit();
			}
		}
		else
			System.out.println("Person not found");
	}
	public static boolean editAddress(String Firstname,String LastName)
	{
		for(Person i : list_of_persons)
		{
			if(i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName))
			{
				System.out.println("Enter new Address");
				i.setAddress(Util.readString());
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
		
	
	public static boolean editCity(String Firstname,String LastName)
	{
		for(Person i : list_of_persons)
		{
			if(i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName))
			{
				System.out.println("Enter new City");
				i.setCity(Util.readString());
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
	public static boolean editState(String Firstname,String LastName)
	{
		for(Person i : list_of_persons)
		{
			if(i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName))
			{
				System.out.println("Enter new State");
				i.setState(Util.readString());
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
	public static boolean editZip(String Firstname,String LastName)
	{
		for(Person i : list_of_persons)
		{
			if(i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName))
			{
				System.out.println("Enter new Zip");
				i.setZip(Util.readInt());
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
	public static boolean editPhone(String Firstname,String LastName)
	{
		for(Person i : list_of_persons)
		{
			if(i.getFirstname().equals(Firstname) && i.getLastname().equals(LastName))
			{
				System.out.println("Enter new Phone number");
				i.setPhone(Util.readString());
				Util.writePerson(path, list_of_persons);
				return true;
			}
		}
		return false;
	}
	public static void sortByName()
	{
		namecomparator nc=new namecomparator();
		Collections.sort(list_of_persons,nc);
		/*
		 * for(int i=0;i<list_of_persons.size();i++) { for(int
		 * j=i+1;j<list_of_persons.size();j++) {
		 * if(list_of_persons.get(i).getFirstname().compareTo(list_of_persons.get(j).
		 * getFirstname())<=0) { System.out.println(list_of_persons.get(i).toString());
		 * break; } else System.out.println(list_of_persons.get(j).toString()); } }
		 */
	}
}
