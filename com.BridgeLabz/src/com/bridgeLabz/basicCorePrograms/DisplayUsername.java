package com.bridgeLabz.basicCorePrograms;

import com.bridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 * Purpose - Accepts Username and print "Hello Username"
 */
public class DisplayUsername {
	public static void main(String[] args) {
		System.out.print("Enter Username");
		String username = Util.readString();
		int len = username.length();
		if (len < 3) {
			System.out.print("Username length shuld be more then 3");
		} else {
			System.out.print("Hello " + username);
		}
	}
}
