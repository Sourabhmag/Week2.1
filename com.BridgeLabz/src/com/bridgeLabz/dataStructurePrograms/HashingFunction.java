package com.bridgeLabz.dataStructurePrograms;



import com.bridgeLabz.utility.Util;
import com.bridgeLabz.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) throws Exception {

		int size;
		System.out.println("Enter the size of hash table");
		size = Util.readInt();
		Utility<?> table[] = new Utility[size];
		Utility<?> writefile = new Utility<>();

		String path = "/home/user/eclipse-workspace/com.BridgeLabz/bin/com/bridgeLabz/dataStructurePrograms/number.txt";
		String[] content_of_file = Util.readFile(path);
			

		for (int j = 0; j < content_of_file.length; j++) {
			( writefile).addToHashTable(table, Integer.parseInt(content_of_file[j]));
		}
		System.out.println("Enetr number to be searched");
		int searchkey = Util.readInt();
		writefile.addToHashTable(table, searchkey);

		for (int j = 0; j < 11; j++) {
			System.out.println();
			try {
				table[j].display();
			} catch (Exception e) {
				System.out.print("null");
			}
		}
		for(int i=0;i<11;i++)
		{ 
			try {
				int size1 = table[i].size();
				for(int j=0;j<size1;j++)
				{
					writefile.addOrdered((int)table[i].pop());
				}
			}
			catch(Exception e)
			{
				continue;
			}
		}
		System.out.println();
		writefile.writeIntoFile(path);
		 

	}

	

}
