package com.bridgeLabz.algorithmsPrograms;

import com.bridgeLabz.utility.Util;

public class FindYourNumber {
	public static void main(String[] args) {
		System.out.println("Enter number for range");
		int range = Util.readInt();
		System.out.println("Think a number in your mind within this number");
		Util.guess(0, range);
	}
}
