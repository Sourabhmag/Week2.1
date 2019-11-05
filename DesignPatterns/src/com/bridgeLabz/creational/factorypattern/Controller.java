package com.bridgeLabz.creational.factorypattern;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to understand how factory pattern is implemented
 * 				(Contains main method and controls operations)
 * Date - 03/11/2019
 */
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerFactory computerfactory = new ComputerFactory();
		Computer obj = computerfactory.getDevice("Server");
		Computer obj1 = computerfactory.getDevice("PC");
		Computer obj2 = computerfactory.getDevice("jaihfl");
		obj.getDevice();
		obj1.getDevice();
		obj2.getDevice();
	}
}
