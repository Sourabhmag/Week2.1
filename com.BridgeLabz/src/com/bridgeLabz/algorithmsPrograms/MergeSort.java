package com.bridgeLabz.algorithmsPrograms;
import com.bridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 *Purpose - To display the strings in sorted order
 */
public class  MergeSort{
	public static void main(String args[]) {
		System.out.println("Enter number of String");
		int numberOfStrings = Util.readInt();
		String[] array = new String[numberOfStrings];
		for(int i=0;i<numberOfStrings;i++)
		{
			array[i]=Util.readString();
		}
		String []sorted=Util.mergeSort(array);
		Util.display(sorted);
		
	}
}
