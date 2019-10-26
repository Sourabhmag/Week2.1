package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to simulate withdraw and diposite banking operations
 *  Date - 18/10/2019
 */
public class BankingCashCounter {

	public static void main(String[] args) {
		System.out.println("Enter number of Customers");
		long balance = 1000000000;
		int choice,amount;
		int customers = Util.readInt();
		for(int i=0;i<customers;i++)
		{
			Util.enQueue(i);
		}
		while(Util.isEmpty()==false)
		{
			System.out.println("Enter your choice :\n1)Withdraw money\n2)Deposit Money");
			choice = Util.readInt();
			switch(choice)
			{
				case 1 : 
				{
					System.out.println("Enter amount to be withdrawal");
					amount = Util.readInt();
					balance=Util.withdraw(balance,amount);
					Util.deQueue();
					break;
				}
				case 2 : 
				{
					System.out.println("Enter amount to be diposit");
					amount = Util.readInt();
					balance=Util.deposite(balance,amount);
					Util.deQueue();
					break;
				}
				default :System.out.println("Invalid choice\nplease stand again in Queue");
			}
		}
		System.out.println("Remaining balance = Rs."+balance);
	}
}
