package com.bridgeLabz.structural.adapter;

public class MobilePhoneCharger implements Target {

	@Override
	public Volt get3Volt(int socketOutput) {
		if (socketOutput == 120) {
			System.out.println("From Electric Socket mobile charger got "+socketOutput+"volt");
			Volt volt = new ElectricSocket().get120Volt();
			Volt convertedVolt = convertVolt(volt, 40);
			System.out.println("Mobile Charger Converted"+volt.getVolts()+"v to "+convertedVolt.getVolts()+"v");
			return convertedVolt;
		}
		if (socketOutput == 240) {
			Volt volt = new ElectricSocket().get240Volt();
			System.out.println("From Electric Socket mobile charger got "+socketOutput+"volt");
			Volt convertedVolt = convertVolt(volt, 80);
			System.out.println("Mobile Charger Converted"+volt.getVolts()+"v to "+convertedVolt.getVolts()+"v");
			return convertedVolt;
		}
		return null;
	}
	private Volt convertVolt(Volt v,int i)
	{
		return new Volt(v.getVolts()/i);
	}

}
