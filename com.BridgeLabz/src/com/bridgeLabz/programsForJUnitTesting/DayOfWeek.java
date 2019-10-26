package com.bridgeLabz.programsForJUnitTesting;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Accept date and print day.
 */
public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("Enter date");
		int d = Util.readInt();
		System.out.println("Enter month");
		int m = Util.readInt();
		System.out.println("Enter year");
		int y = Util.readInt();

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		switch (d0) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satarday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}
}
