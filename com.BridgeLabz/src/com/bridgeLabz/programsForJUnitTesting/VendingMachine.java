package com.bridgeLabz.programsForJUnitTesting;

import com.bridgeLabz.utility.Util;

public class VendingMachine {
	static int amount;
	public static int calculateNotes(int note)
	{
		int count=0;
		for(int i=0;i<=1000;i++)
		{
			if(amount-note<0)
			{
				break;
			}
			amount-=note;
			count++;
		}
		System.out.println("Notes of "+note+" returned = "+count);
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter amount");
		amount = Util.readInt();
		int total_notes=0;
		int count[] = new int[9];
		int notes[]= {1000,500,100,50,20,10,5,2,1};
		//System.out.println("Notes avaliable = 1, 2, 5, 10, 50, 100, 500 and 1000");
		for(int i=0;i<9;i++)
		{
			count[i]=VendingMachine.calculateNotes(notes[i]);
			total_notes += count[i];
		}
		System.out.println("Total notes returned = "+total_notes);
	}
}
