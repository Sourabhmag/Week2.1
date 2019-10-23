package com.BridgeLabz.AlgorithmsPrograms;

import com.BridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Purpose - Used to sort integer array
 *
 */
public class BubbleSort {
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter size of array");
		int size = Util.readInt();
		Integer []arr = new Integer[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=Util.readInt();
		}
		arr=Util.bubbleSort(arr);
		Util.display(arr);
	}

}
