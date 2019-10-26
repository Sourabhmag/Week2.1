package com.bridgeLabz.functionalPrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Purpose - Accepts Co-ordinates of a point and find its distance from origin
 */
public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter value of X");
		double x = Util.readDouble();
		System.out.println("Enter value of Y");
		double y = Util.readDouble();
		System.out.println("Distance = " + Math.sqrt(x * x + y * y));
	}
}
