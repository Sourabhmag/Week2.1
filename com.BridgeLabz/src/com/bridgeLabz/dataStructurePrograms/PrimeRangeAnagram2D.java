package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to print anagram of given numbers in given range
 * Used Data Structure - 2D array
 * Date - 19/10/2019
 */
public class PrimeRangeAnagram2D {

	public static void main(String[] args) {
		int prime_numbers[]=Util.primecheck();
		String arr1[][]=Util.isPrimeAnagram2D(prime_numbers);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i][j]!=null)
				{
					System.out.println(arr1[i][j]+" ");
				}
			}
			
		}
		
	}

}
