package com.BridgeLabz.AlgorithmsPrograms;


import com.BridgeLabz.utility.Util;
/**
 * @author Sourabh Magdum
 * AnagramDetection = Accepts to strings and finds whether both are anagram of each other or not.
 */
public class AnagramDetection {
	public static void main(String[] args) {
	
		System.out.println("Enter strings");
		String string1 = Util.readString();
		String string2 = Util.readString();
		int result =Util.anagram(string1,string2);
		if(result==1)
		{
		  System.out.println("anagram");	
		}
		else
		{
			
			System.out.println("not anagram");
			}
		
		
		
	}
}
