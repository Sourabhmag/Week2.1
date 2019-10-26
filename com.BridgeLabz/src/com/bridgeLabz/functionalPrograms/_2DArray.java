package com.bridgeLabz.functionalPrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Purpose - Accepts various numbers , add into 2D array and print it in the form of Matrix
 */
public class _2DArray {
	

	public static void main(String[] args) {
		System.out.println("1.Enter Integers\n2.Enter Double\n3.Enter boolean");
		int choice = Util.readInt();
		System.out.println("Enter number of rows");
		int row = Util.readInt();
		System.out.println("Enter number of columns");
		int column = Util.readInt();

		switch (choice) {
		case 1:
			Util.addint(row, column);
			break;
		case 2:
			Util.adddouble(row, column);
			break;
		case 3:
			Util.addbool(row, column);
			break;
		default:
			System.out.println("Enter valid choic");
		}
	}

}
