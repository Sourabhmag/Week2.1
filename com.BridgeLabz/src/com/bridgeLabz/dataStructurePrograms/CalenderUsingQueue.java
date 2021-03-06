package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;
import com.bridgeLabz.utility.Utility;
/**
 * @author Sourabh Magdum
 * @Porpose - Accepts month and year from user and prints calender of that month.
 * Used Data Structure - Queue
 *  Date - 20/10/2019
 */
public class CalenderUsingQueue {

	public static void main(String[] args) {
		System.out.println("Enter month");
		int month = Util.readInt();
		System.out.println("Enter year");
		int year = Util.readInt();

		int EndDate = Util.setEndDate(month, year);
		int day = Util.dayOfWeek(1, month, year);
		int x=1;
		Utility <?>calender = new Utility<>();
		for(int i=0;i<=42;i++)
		{
			if(i==day && x<=EndDate)
			{
				calender.enQueue(x);
				++x;
				++day;
			}
			else
			{
				calender.enQueue(0);
			}
		}
		System.out.print("  Sun Mon Tue Wed Thu fri Sat");
		int DeQueuedvalue;
		for (int i = 0; i < 6; i++) {
			System.out.println();
			for (int k = 0; k < 7; k++) {
				
				DeQueuedvalue = (int) calender.deQueue();
				if (DeQueuedvalue!= 0) {
					System.out.printf("%4d", DeQueuedvalue);
				} else {
					System.out.print("    ");
				}
			}
		}
	}

}
