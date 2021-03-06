package com.bridgeLabz.algorithmsPrograms;
import com.bridgeLabz.utility.Util;

/**
 * @author Sourabhh Magdum
 *Purpose - Accepts the String and print its permutations
 */
public class Permutation {
	public static void main(String[] args) {
		System.out.println("Enter String length for permutation");
		boolean flag=false;
		String string;
		int size = Util.readInt();
		System.out.println("Enter String");
		do
		{
			
			string = Util.readString();
			if(string.length()==size) {
				flag=true;}
			else {System.out.println("Enter String with valid string length:");}
		}while(flag!=true);
//		if(string.length()!=size)
//		{
//			System.out.println("Provided string size and string length "
//					+ "is not matching,please enter valid details");
//			return;
//		}
		Util.PermutationRecursive(string, 0, size - 1);
	}

}
