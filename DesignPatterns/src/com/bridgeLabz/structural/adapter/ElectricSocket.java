package com.bridgeLabz.structural.adapter;

public class ElectricSocket {
	public Volt get120Volt()
	{
		return new Volt(120);
	}
	public Volt get240Volt()
	{
		return new Volt(240);
	}
}
