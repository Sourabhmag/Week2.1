package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Date - 17/10/2019
 *Purpose - Reads content of file ,search keyword provided by user 
 *			,if found remove the number and write the end result in file.
 * @param <T>
 */
public class OrderedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "/home/user/eclipse-workspace/com.BridgeLabz/src/com/BridgeLabz/DataStructurePrograms/number.txt";
		String []content_of_file=Util.readFile(path);
		Integer []content_of_file_int = new Integer[content_of_file.length];
		for(int i=0;i<content_of_file.length;i++)
		{
			content_of_file_int[i] = Integer.parseInt(content_of_file[i]);
		}
		Integer []sorted_content_of_file=Util.bubbleSort(content_of_file_int);
		for (int j = 0; j < sorted_content_of_file.length; j++) {
			Util.addUnordered(sorted_content_of_file[j]);
		}
		System.out.println("Enetr Number to be searched");
		Integer searchkey = Util.readInt();
		if(Util.search(searchkey)==true)
		{
			int position=Util.index(searchkey);
			Util.pop(position);
		}
		else
		{
			Util.addOrdered(searchkey);
		}
		Util.display();
		Util.writeIntoFile(path);
	}

}
