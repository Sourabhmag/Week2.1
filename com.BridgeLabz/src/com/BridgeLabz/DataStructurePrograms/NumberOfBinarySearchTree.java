package com.BridgeLabz.DataStructurePrograms;

import com.BridgeLabz.utility.Util;
import com.BridgeLabz.utility.Utility;

/**
 * @author Sourabh Magdum
 * @Purpose - Accepts number of nodes and prints how many different binary trees can be made
 *  Date - 18/10/2019
 */
public class NumberOfBinarySearchTree {
	
	/**
	 * @Purpose - Prints Number of Binary Search trees
	 * @param nodes - accepts number of nodes
	 */
	public static void countBinarySearchTrees(long nodes)
	{
		Utility <?>object = new Utility<>();
		long a = 2*nodes;
		long b = nodes+1;
		a=object.calculateCatalonNumber(a);
		b=object.calculateCatalonNumber(b);
		long c=object.calculateCatalonNumber(nodes);
		long result = a/(b*c);
		System.out.println(nodes+"\t"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of test cases");
		int tests=Util.readInt();
		System.out.println("Enter number of nodes");
		while(tests!=0)
		{
			tests--;
			countBinarySearchTrees(Util.readLong());
		}
	}

}
