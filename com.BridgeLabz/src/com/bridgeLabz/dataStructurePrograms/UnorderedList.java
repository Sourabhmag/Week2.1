package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * Date - 17/10/2019
 *Purpose - Reads content of file ,search keyword provided by user 
 *			,if found remove the word and write the end result in file.
 * @param <T>
 */
public class UnorderedList {
	
	public static void main(String[] args) throws Exception {
		String path = "/home/user/eclipse-workspace/com.BridgeLabz/src/com/BridgeLabz/DataStructurePrograms/sourabh.txt";
		String []content_of_file = Util.readFile(path);
		for(int i=0;i<content_of_file.length;i++)
		{
			System.out.println(content_of_file[i]);
		}
		for (int j = 0; j < content_of_file.length; j++) {
			Util.addUnordered(content_of_file[j]);
		}
		System.out.println("Enetr word to be searched");
		String searchkey = Util.readString();
		if(Util.search(searchkey)==true)
		{
			int position=Util.index(searchkey);
			Util.pop(position);
		}
		else
		{
			Util.addUnordered(searchkey);
		}
		
		
		Util.display();
		Util.writeIntoFile(path);
	}
}
