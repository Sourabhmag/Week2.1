package com.bridgeLabz.creational.factorypattern;

/**
 * @author Sourabh Magdum
 * @Purpose - used for implement factory pattern
 * Date - 03/11/2019
 */
public class ComputerFactory {
	public Computer getDevice(String str)
	{
		if(str.equals("Server"))
			return new Server();
		else if(str.equals("PC"))
			return new PC();
		else
			return new Lapton();
	}
}
