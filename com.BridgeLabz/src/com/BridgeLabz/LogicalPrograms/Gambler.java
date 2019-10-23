package com.BridgeLabz.LogicalPrograms;

import com.BridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 * @Purpose - Find Whether gambler achieves his/her goal or not
 * stack - initial investment of gambler
 * Number - Maximum times gambler can gamble
 */
public class Gambler {
	public static void main(String[] args) {
		System.out.println("Enter Stack,Goal and Number");
		int stack = Util.readInt();
		int goal = Util.readInt();
		int num = Util.readInt();
		int gamb = 0, win = 0, loss = 0;
		while (stack != 0 && stack != goal && num != 0) {
			num--;
			gamb++;
			double x = Math.random();
			if (x >= 0.5) {
				win++;
				++x;
			} else {
				loss++;
				--x;
			}
		}
		System.out.println("Win = " + win);
		System.out.println("loss = " + loss);
		System.out.println("Percentage Win = " + (100 * win / gamb));
		System.out.println("Percentage Loss = " + (100 * loss / gamb));
	}
}
