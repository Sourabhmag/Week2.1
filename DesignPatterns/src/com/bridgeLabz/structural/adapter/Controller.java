package com.bridgeLabz.structural.adapter;

import utility.Util;

public class Controller {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.chargeMe();
	}
	public void chargeMe()
	{
		Target target = new MobilePhoneCharger();
		System.out.println("Choose socket output\n1)120 volts\n2)240 volts");
		int choice = Util.readInt();
		switch(choice)
		{
		case 1 :
			Volt volt = target.get3Volt(120);
			System.out.println("Mobile Phone is using "+volt.getVolts()+" v supply");
			break;
		case 2 :
			Volt volt1 = target.get3Volt(240);
			System.out.println("Mobile Phone is using "+volt1.getVolts()+" v supply");
			break;
		}
		
	}
	
}
