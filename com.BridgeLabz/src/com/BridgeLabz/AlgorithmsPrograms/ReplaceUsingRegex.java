package com.BridgeLabz.AlgorithmsPrograms;

import java.time.LocalDate;
import java.util.regex.*;


import com.BridgeLabz.utility.Util;


public class ReplaceUsingRegex {

	public static void main(String[] args) {
		String string = "Hello <<name>>, We have your full name as <<full name>> in our system. "
				+ "your contact number is 91-xxxxxxxxxx. Please,let us know in case of any "
				+ "clarification Thank you BridgeLabz 01/01/2016.";
		String name,full_name,contact_number;
		Pattern name_pattern,full_name_pattern,contact_number_pattern;
		Matcher name1,full_name1,contact_number1;

		do {
		System.out.println("Enter name in characters");
		name = Util.readString();
		name_pattern=Pattern.compile("[a-zA-Z]+\\.?",Pattern.CASE_INSENSITIVE);
		name1 = name_pattern.matcher(name);
		}while(name1.matches()==false);
		
		do {
			System.out.println("Enter Full Name in character");
			full_name = Util.readString();
			full_name_pattern=Pattern.compile("[a-zA-Z]+\\.?",Pattern.CASE_INSENSITIVE);
			full_name1 = full_name_pattern.matcher(full_name);
		}while(full_name1.matches()==false);
		
		do
		{
			System.out.println("Enter contact number in numbers");
			contact_number = Util.readString();
			contact_number_pattern=Pattern.compile("(0/91)?[7-9][0-9]{9}");
			contact_number1 = contact_number_pattern.matcher(contact_number);
		}while(contact_number1.matches()==true);
	
		
		String old_name = "<<name>>";
		Pattern pattern_name= Pattern.compile(old_name);
		Matcher str_name = pattern_name.matcher(string);
		
		String old_full_name = "<<full name>>";
		Pattern pattern_full_name= Pattern.compile(old_full_name);
		Matcher str_full_name= pattern_full_name.matcher(string);
		
		String old_contact_number = "xxxxxxxxxx";
		Pattern pattern_contact_number = Pattern.compile(old_contact_number);
		Matcher str_contact_number= pattern_contact_number.matcher(string);
		
		String old_date = "01/01/2016";
		Pattern pattern_date = Pattern.compile(old_date);
		Matcher str_date= pattern_date.matcher(string);
		
		str_name.replaceAll(name);
		str_full_name.replaceAll(full_name);
		str_contact_number.replaceAll(contact_number);
		LocalDate date = LocalDate.now();
		str_date.replaceAll(date.toString());
		System.out.println(string);
	}
}
