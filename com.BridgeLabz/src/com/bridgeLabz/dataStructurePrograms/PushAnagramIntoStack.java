package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to print anagram of given prime numbers in reverse order by using stack
 * Used Data Structure - Stack
 * Date - 18/10/2019
 */
public class PushAnagramIntoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime_numbers[]=Util.primecheck();
		String arr1[][]=Util.isPrimeAnagram2D(prime_numbers);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i][j]!=null)
				{
					Util.push(arr1[i][j]);
				}
			}
			
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i][j]!=null)
				{
					System.out.println((String)Util.pop());
				}
			}
			
		}
	}

}
