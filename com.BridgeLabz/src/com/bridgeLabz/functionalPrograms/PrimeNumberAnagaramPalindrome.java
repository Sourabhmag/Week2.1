package com.bridgeLabz.functionalPrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Purpose - Find prime number from 0 to 1000,prints its anagram and palindrome
 */
public class PrimeNumberAnagaramPalindrome {

	public static void main(String[] args) {
		System.out.println("1.Primeanagram");
		System.out.println("2.Primepalindrome");
		System.out.println("Enter your choice");
		int choice = Util.readInt();
		int result[]=Util.primecheck();
		
		
		switch (choice) {
		case 1: {
			Util.isPrimeAnagram(result);
			break;
		}
		case 2 :
		{
			Util.isPrimepPalidrome(result);
			break;
		}
		}
	}

}
