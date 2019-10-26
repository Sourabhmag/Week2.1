package com.bridgeLabz.functionalPrograms;

import com.bridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 * @Purpose - Prints solution of Quadratic Equation 
 */
public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Quadratic equation is a*x*x + b*x + c = 0");
		int a=0,b=0,c=0;
		try {
			System.out.println("Enter value of 'a'");
			 a = Util.readInt();
			System.out.println("Enter value of 'b'");
			 b = Util.readInt();
			System.out.println("Enter value of 'c'");
			 c = Util.readInt();
			 Util.quadratic(a,b,c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Numbers are accepted only");
		}
		
		
	}
}
