package com.bridgeLabz.basicCorePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Purpose - Prints Harmoinc Numbers
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter number");
		int number = Util.readInt();
		Util.harmonicNumber(number);
		
	}

}
