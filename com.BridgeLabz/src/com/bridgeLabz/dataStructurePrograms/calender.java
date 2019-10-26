package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Porpose - Accepts month and year from user and prints calender of that month.
 * Used Data Structure - 2D array
 *  Date - 20/10/2019
 */
public class calender {
	public static void main(String[] args) {
		System.out.println("Enter month");
		int month = Util.readInt();
		System.out.println("Enter year");
		int year = Util.readInt();

		int end_date = Util.setEndDate(month, year);
		int day = Util.dayOfWeek(1, month, year);
		int date[][] = Util.getCalender(day, end_date);
		System.out.print("  Sun Mon Tue Wed Thu fri Sat");

		for (int i = 0; i < 6; i++) {
			System.out.println();
			for (int k = 0; k < 7; k++) {
				if (date[i][k] != 0) {
					System.out.printf("%4d", date[i][k]);
				} else {
					System.out.print("    ");
				}
			}
		}

	}

}
