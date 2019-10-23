package com.BridgeLabz.DataStructurePrograms;

import com.BridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to print prime numbers in given range
 * Used Data Structure - 2D array
 * Date - 19/10/2019
 */
public class PrimeNumberRange2D {

	public static void main(String[] args) {
		int array[][] = new int[10][167];
		int prime_numbers[]=Util.primecheck();
		int range[]= {0,100,200,300,400,500,600,700,800,900,1000};
		for(int i=0;i<10;i++)
		{
			System.out.println();
			for(int j=0;j<167;j++)
			{
				if(range[i] <= prime_numbers[j] && prime_numbers[j] <= range[i+1])
				{
					array[i][j] = prime_numbers[j];
					System.out.print(array[i][j]+" ");
				}
			}
		}
	}

}
