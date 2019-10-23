package com.BridgeLabz.AlgorithmsPrograms;
import com.BridgeLabz.utility.Util;

/**
 * @author Sourabh MAgdum
 * Purpose - Insertion Sort for Strings
 *
 */
public class InsertionSort {
	
    public static void main(String[] args) 
    {
        System.out.println("Enter number of Strings");
        int size=Util.readInt(); 
        //sc.nextLine();
        String []arr = new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=Util.readString();
        }
        arr = Util.insertionSort(arr,arr.length);
        System.out.println("Sorted Strings : ");
        Util.display(arr);
    }
}
