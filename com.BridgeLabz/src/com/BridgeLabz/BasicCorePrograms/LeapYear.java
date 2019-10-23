package com.BridgeLabz.BasicCorePrograms;

import com.BridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 * Purpose - Finds the entered year is leap year or not
 */
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter 4 digit year");
		int year = Util.readInt();
		Util.leapYear(year);
	}
}
