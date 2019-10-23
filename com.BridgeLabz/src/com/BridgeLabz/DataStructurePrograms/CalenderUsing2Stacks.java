package com.BridgeLabz.DataStructurePrograms;

import com.BridgeLabz.utility.Util;
import com.BridgeLabz.utility.Utility;

/**
 * @author Sourabh Magdum
 * @Porpose - Accepts month and year from user and prints calender of that month.
 * Used Data Structure - 2-stacks
 *  Date - 20/10/2019
 */
public class CalenderUsing2Stacks {

	public static void main(String[] args) {
		System.out.println("Enter month");
		int month = Util.readInt();
		System.out.println("Enter year");
		int year = Util.readInt();

		int EndDate = Util.setEndDate(month, year);
		int day = Util.dayOfWeek(1, month, year);
		int x=1;
		Utility <?>stack1 = new Utility<>();
		Utility <?>stack2 = new Utility<>();
		for(int i=0;i<=42;i++)
		{
			if(i==day && x<=EndDate)
			{
				stack1.push(x);
				++x;
				++day;
			}
			else
			{
				stack1.push(0);
			}
		}
		for(int i=0;i<=42;i++)
		{
			stack2.push(stack1.pop());
		}
		System.out.print("  Sun Mon Tue Wed Thu fri Sat");
		int Popedvalue;
		for (int i = 0; i < 6; i++) {
			System.out.println();
			for (int k = 0; k < 7; k++) {
				
				Popedvalue = (int) stack2.pop();
				if (Popedvalue!= 0) {
					System.out.printf("%4d", Popedvalue);
				} else {
					System.out.print("    ");
				}
			}
		}
	}

}
