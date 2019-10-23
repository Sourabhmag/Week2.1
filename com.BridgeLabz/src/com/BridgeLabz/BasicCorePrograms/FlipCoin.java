package com.BridgeLabz.BasicCorePrograms;

import com.BridgeLabz.utility.Util;
/**
 * @Auther - Sourabh Magdum
 * Purpose - To print percenage haed and tail occured
 */
public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("enter number of times you want to flip coin");
		int count = Util.readInt();
		Util.flipCoin(count);
		
	}

}
