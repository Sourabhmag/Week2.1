package com.bridgeLabz.AddressBook.service;

import com.bridgeLabz.AddressBook.model.Person;

public class namecomparator implements Comparable<Person> {
	
	 public int compare(Person personone ,Person persontwo)
	 {
		 return(personone.getFirstname().compareTo(persontwo.getFirstname()));
	 }

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
