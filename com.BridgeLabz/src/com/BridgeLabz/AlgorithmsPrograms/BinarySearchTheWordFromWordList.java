package com.BridgeLabz.AlgorithmsPrograms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.BridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 *  Functionality = Finds word searched by user is present in file or not 
 *
 */
public class BinarySearchTheWordFromWordList {
	

	public static void main(String[] args) throws Exception {
		File file = new File("/home/user/eclipse-workspace/com.BridgeLabz/src/com/BridgeLabz/AlgorithmsPrograms/sourabh.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] words = null;
		while ((st = br.readLine()) != null) {
			words = st.split(" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to be searched");
		String search = sc.nextLine();
		Util.Search(words, search);
		br.close();sc.close();
	}
}
