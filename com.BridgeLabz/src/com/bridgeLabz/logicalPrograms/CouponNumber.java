package com.bridgeLabz.logicalPrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Find unique coupon numbers
 */
public class CouponNumber {
	public static void main(String[] args) {
		System.out.println("Enter number of Coupons");
		int coupons = Util.readInt();
		int duplicates = 0;
		Integer [] arr = new Integer[coupons];
		int ary[] = new int[arr.length];
		arr[0]=1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int)Math.random() * 5000;
			for(int j = 0;j<i;j++)
			{
				while(arr[j]==arr[i])
				{
					arr[i] = (int)(Math.random()*5000);
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for(int j = 0;j<i;j++)
			{
				while(arr[j]==arr[i])
				{
					arr[i] = (int)(Math.random()*5000);
				}
			}
		}
		arr = Util.bubbleSort(arr);
		for (int j = 1; j < arr.length; j++) {
			if (arr[j - 1] == arr[j]) {
				duplicates++;
				ary[j] = j;
			}
			ary[j] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Coupon no " + (i + 1) + " = " + arr[i]);
		}
		System.out.println("Duplicates found = " + duplicates);
	}
}
