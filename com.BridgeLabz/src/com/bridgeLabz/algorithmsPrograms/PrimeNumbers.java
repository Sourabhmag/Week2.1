package com.bridgeLabz.algorithmsPrograms;


import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh MAgdum
 * Purpose - Prints prime numbers between 0 to 1000
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter number");
			int []primeNumber = Util.primecheck();
			for(int i=0;i<primeNumber.length;i++)
			{
				System.out.println(primeNumber[i]);
			}
	}
}
