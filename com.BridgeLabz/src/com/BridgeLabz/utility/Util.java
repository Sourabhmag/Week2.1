package com.BridgeLabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Used To store repeted code
 * 
 * @author Sourabh Magdum
 *
 */
public class Util<T> {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @author Sourabh Magdum
	 * @Purpose - It is a class which is used to create node
	 * @param <T> - Generic variable
	 */
	public static class Node<T> {
		T data;
		Node<T> next;

		public Node(T d) {
			data = d;
			next = null;
		}
	}

	/**
	 * head - head of linkedList
	 */
	static Node head;

	/**
	 * @Purpose - To create Empty Unordered List
	 * @param <T> - Generic variable
	 * @return - Returns head of list
	 */
	public static <T> Node<T> List() {
		head = null;
		return head;
	}

	/**
	 * @Purpose - To create Empty Ordered List
	 * @param <T> - Generic variable
	 * @return - Returns head of list
	 */
	public static <T> Node<T> orderedList() {
		head = null;
		return head;
	}

	/**
	 * @Purpose - To create Empty stack
	 * @param <T> - Generic variable
	 * @return - Returns top of stack
	 */
	public static <T> Node<T> stack() {
		head = null;
		return head;
	}

	/**
	 * @Purpose - To create Empty queue
	 * @param <T> - Generic variable
	 * @return - Returns front of queue
	 */
	public static <T> Node<T> queue() {
		head = null;
		return head;
	}
	/**
	 * @Purpose - To create Empty queue
	 * @param <T> - Generic variable
	 * @return - Returns front of queue
	 */
	public static <T> Node<T> Deque() {
		head = null;
		return head;
	}
	/**
	 * @Purpose - Used to add node in Unordered list
	 * @param <T>  - Generic Variable
	 * @param data - A item which user want to insert into Unordered list
	 */
	public static <T> void addUnordered(T item) {
		Node<T> newNode = new Node<T>(item);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

	/**
	 * @Purpose - Used to enqueue in Queue
	 * @param <T>  - Generic Variable
	 * @param item - Item to be enqueued
	 */
	public static <T> void enQueue(T item) {
		Node front = head;
		addUnordered(item);
	}

	/**
	 * @Purpose - Used to dnQueue in Queue
	 * @param <T> - Generic Variable
	 */
	public static <T> T deQueue() {
		T dnQueued_element = (T) head.data;
		head = head.next;
		return dnQueued_element;
	}
	
	/**
	 * @Purpose - Adds item at front of data structure
	 * @param <T> - Generic variable
	 * @param item - Item which will be inserted
	 */
	public static <T> void addFront(T item)
	{
		Node newNode = new Node(item);
		newNode.next=head;
		head=newNode;
	}
	/**
	 * @Purpose - Adds item at rear of data structure
	 * @param <T> - Generic variable
	 * @param item - Item which will be inserted
	 */
	public static <T> void addRear(T item)
	{
		addUnordered(item);
	}
	/**
	 * @Purpose - Removes item from front of data structure
	 * @param <T> - Generic variable
	 * @return - Returns removed item
	 */
	public static <T> T removeFront()
	{
		T item = null;
		if(isEmpty()==false)
		{
			item = (T) head.data;
			head = head.next;
			return item;
		}
		else
		{
			System.out.println("Data staructure is empty");
			return item;
		}
	}
	/**
	 * @Purpose - Removes item from rear end of data structure
	 * @param <T> - Generic variable
	 * @return - Returns removed item
	 */
	public static <T> T removeRear()
	{
		T item;
		Node temp = head;
		if(isEmpty()==false)
		{
			if(temp.next==null)
			{
				item = (T) temp.data;
				head=null;
			}
			else
			{
				if(temp.next.next==null)
				{
					item = (T) temp.next.data;
					head.next=null;
				}
				else
				{
					while(temp.next.next!=null)
					{
						temp=temp.next;
					}
					item = (T) temp.next.data;
					temp.next=null;
				}
			}
		}
		else
		{
			item = null;
			System.out.println("Data structure is empty");
		}
		return item;
	}
	/**
	 * @Purpose - Used to push in Stack
	 * @param <T>  - Generic Variable
	 * @param item - Item to be pushed
	 */
	public static <T> void push(T item) {
		addUnordered(item);
	}

	
	/**
	 * @Purpose - Used to add node in ordered list
	 * @param <T>  - Generic Variable
	 * @param data - A item which user want to insert into ordered list
	 */
	public static <T extends Comparable> void addOrdered(T item) {
		Node<T> newNode = new Node<T>(item);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				if (temp.data.compareTo(item) == 0 || temp.data.compareTo(item) > 0) {
					newNode.next = head;
					head = newNode;
					return;
				} else {
					if (temp.data.compareTo(item) < 0 && temp.next.data.compareTo(item) >= 0) {
						newNode.next = temp.next;
						temp.next = newNode;
						return;
					}
				}
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}
	/**
	 * @Purpose - Accepts date and returns day
	 * @param day - accepts date
	 * @param month - accepts month
	 * @param year - accepts year
	 * @return - returns day
	 */
	public static int dayOfWeek(int day,int month,int year)
	{
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}
	/**
	 * @Purpose - Used to return top of stack without removing any item from stack
	 * @param <T> - Generic Variable
	 * @return - Returns item which is present on top of stack
	 */
	public static <T> T peek() {
		T peek_value = null;
		if (isEmpty() == false) {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			peek_value = (T) temp.data;
		} else
			System.out.println("Data Structure is empty");
		return peek_value;
	}

	/**
	 * @Purpose - Used to pop item from Data Structure
	 * @param <T> - Generic Variable
	 * @return - Returns item which is present on top of Data Structure
	 */
	public static <T> T pop() {
		T last_item = null;
		if (isEmpty() == false) {
			Node temp = head;
			if (temp.next == null) {
				last_item = (T) head.data;
				head = null;
				return last_item;
			} else {
				if (temp.next.next == null) {
					last_item = (T) head.next.data;
					head.next = null;
					return last_item;
				} else {
					while (temp.next.next != null) {
						temp = temp.next;
					}
					last_item = (T) temp.next.data;
					temp.next = null;
					return last_item;
				}
			}
		} else {
			System.out.println("Data Structure is empty");
			return last_item;
		}
	}
	/**
	 * @Purpose - Used to pop item present at given position from Data Structure
	 * @param <T> - Generic Variable
	 * @return - Returns item which is present at given position from Data Structure
	 */
	public  static<T> T pop(int position) {
		T pop_item;

		if (position == 1) {
			pop_item = (T) head.data;
			head = head.next;
		} else {
			Node temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			pop_item = (T) temp.next.data;
			temp.next = temp.next.next;
		}
		return pop_item;
	}

	/**
	 * @Purpose - Used to insert a item at given position
	 * @param <T> - Generic Variable
	 * @param position - Position where user want insert item
	 * @param item - item which user want to insert
	 */
	public static <T> void insert(int position, T item) {
		Node temp = head;
		for (int i = 0; i < position; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(item);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	/**
	 * @Purpose - To know size of data structure
	 * @return -  returns size of data structure
	 */
	public static int size() {
		int count = 0;
		Node temp = head;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		count++;
		return count;
	}

	/**
	 * @Purpose - Get an index from data structure where given item is present
	 * @param <T> - Generic Variable
	 * @param item - Given item whose index is required
	 * @return - returns an index of item
	 */
	public static <T> int index(T item) {
		int count = 0;
		if (head == null) {
			System.out.println("given LinkedList is empty");
			return count;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				count++;
				if ((temp.data).equals(item)) {
					return count;
				}
				temp = temp.next;
			}
			count++;
			if ((temp.data).equals(item)) {
				return count;
			} else {
				count = 0;
				return count;
			}

		}
	}

	/**
	 * @Purpose - Used to append an Unordered list
	 * @param <T> - - Generic Variable
	 * @param item - Item which will be appended
	 */
	public static <T> void appendUnordered(T item) {
		addUnordered(item);
	}
	
	/**
	 * @Purpose - Used to append an Ordered list
	 * @param <T> - - Generic Variable
	 * @param item - Item which will be appended
	 */
	public static <T extends Comparable> void appendOrdered(T item) {
		addOrdered(item);
	}

	/**
	 * @Purpose - Check whether data structure is empty or not
	 * @return - Returns true if data structure is empty else returns false
	 */
	public static boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * @Purpose - Used to remove node from linked list
	 * @param <T>    - Generic variable
	 * @param target - It points to a node which user want to remove
	 */
	public static <T> void remove(T item) {
		Node target_node = head;

		while (target_node.next != null) {
			if ((target_node.data).equals(item)) {

				if (target_node == head) {
					head = target_node.next;
					return;
				} else {
					Node temp = head;
					while (temp.next != null) {
						if (temp.next == target_node) {
							temp.next = target_node.next;
							return;
						}
						temp = temp.next;
					}
				}
			}
			target_node = target_node.next;
		}
		if ((target_node.data).equals(item)) {

			Node temp = head;
			while (temp.next != null) {
				if (temp.next == target_node) {
					temp.next = target_node.next;
					return;
				}
				temp = temp.next;
			}
		}
	}

	/**
	 * @Purpose - used to search a element in linked list
	 * @param <T>  - Generic variable
	 * @param data - It is a search key
	 */
	public static <T> boolean search(T data) {

		if (head == null) {
			System.out.println("given LinkedList is empty");
			return false;
		} else {
			int count = 0;
			Node<T> temp = head;
			while (temp.next != null) {
				count++;
				if ((temp.data).equals(data)) {
					System.out.println("Given item is present in LinkedList at position " + count);
					return true;
				}
				temp = temp.next;
			}
			count++;
			if ((temp.data).equals(data)) {
				System.out.println("Given item is present in LinkedList at position " + count);
				return true;
			} else {
				System.out.println("Given itrm is not present in LinkedList");
				return false;
			}

		}
	}

	/**
	 * @Purpose - Used to display the linked list
	 * @param <T> - Generic variable
	 */
	public static <T> void display() {
		if (head == null) {
			System.out.println("given LinkedList is empty");
		} else {
			Node<T> temp = head;
			while (temp.next != null) 
			{
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
			System.out.print(temp.data + "\t");
		}
	}

	/**
	 * @Purpose - Used to write file
	 * @path - Path where file is present
	 * @param <T> - Generic Variable
	 * @throws Exception - Used to handle file not found exception
	 */
	public static <T> void writeIntoFile(String path) throws Exception {
		FileWriter fileWriter = new FileWriter(path);
		fileWriter.flush();
		BufferedWriter write = new BufferedWriter(fileWriter);
		if (head == null) {
			write.close();
			return;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				write.write((temp.data + " ").toString());
				temp = temp.next;
			}
			write.write((temp.data + " ").toString());
		}
		write.close();
	}

	/**
	 * @Purpose - Used to read file
	 * @param path - path where file is present
	 * @return - It returns Content of file
	 * @throws IOException
	 */
	public static String[] readFile(String path) throws IOException {
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] content_of_file = null;

		while ((st = br.readLine()) != null) {
			content_of_file = st.split(" ");
		}
		br.close();
		return content_of_file;
	}

	/**
	 * @return Integer value read from user
	 */

	public static int readInt() {

		boolean flag = false;
		int value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Integer.parseInt(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct integer value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Long value read from user
	 */
	public static long readLong() {

		boolean flag = false;
		long value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Long.parseLong(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct integer value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Double value read from user
	 */
	public static double readDouble() {
		boolean flag = false;
		double value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Double.parseDouble(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct double value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Float value read from user
	 */
	public static float readFloat() {
		boolean flag = false;
		float value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Float.parseFloat(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct float value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Boolean value read from user
	 */
	public static boolean readBoolean() {
		boolean flag = false;
		boolean value_to_be_returned = false;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Boolean.parseBoolean(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct Boolean value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return String value read from user
	 */
	public static String readString() {
		return sc.nextLine();
	}

	public static int anagram(String string1, String string2) {

		if (string1.length() != string2.length()) {
			// System.out.println("Given strings are not anagram");

		} else {
			char[] array1 = string1.toLowerCase().toCharArray();
			char[] array2 = string2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if (Arrays.equals(array1, array2)) {
				return 1;
			}
		}
		return 0;
	}

	/**
	 * @Purpose - Used to display 2D array
	 * @param arr    - input of 2D array for display
	 * @param row    - number of rows
	 * @param column - number of columns
	 */
	public static <T> void display(T array[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + "\t");
			}
		}
	}
	/**
	 * @Purpose - Used to set last date of month in process of generation of calender
	 * @param month - Accepts month
	 * @param year - Accepts Year
	 * @return = Returns last date of month provided by user
	 */
	public static int setEndDate(int month,int year)
	{
		int[]month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int end_date;
		if(month==2 && year%4==0)
		{
			 month_days[month-1]=29;
		}
		end_date=month_days[month-1];
		return end_date;
	}
	/**
	 * @Purpose - Generates calender structure in structure in 2D array
	 * @param day - Accept starting day of month
	 * @param end_date - Accepts last date of month
	 * @return - Returns 2D array which holds calender
	 */
	public static int[][] getCalender(int day,int end_date)
	{
		int date[][]=new int[6][7];
		int x=1;
		int j=day;
		for(int i = 0;i<6;i++)
		{
			for(;j<7;j++)
			{
				if(x<=end_date)
				{
					date[i][j] = x;
					x++;
				}
			}
			j=0;
		}
		return date;
	}
	/**
	 * Used to add Integers into 2D array
	 * 
	 * @param row    - number of rows
	 * @param column - number of columns
	 */
	public static void addint(int row, int column) {
		Integer[][] arr = new Integer[row][column];
		System.out.println("Enter INTEGER elements one by one");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = Util.readInt();
			}
		}
		Util.display(arr, row, column);
	}

	/**
	 * Used to add Doubles into 2D array
	 * 
	 * @param row    - number of rows
	 * @param column - number of columns
	 */
	public static void adddouble(int row, int column) {
		Double[][] arr = new Double[row][column];
		System.out.println("Enter DOUBLE elements one by one");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = Util.readDouble();
			}
		}
		Util.display(arr, row, column);
	}

	/**
	 * Used to add Boolean values into 2D array
	 * 
	 * @param row    - number of rows
	 * @param column - number of columns
	 */
	public static void addbool(int row, int column) {
		Boolean[][] arr = new Boolean[row][column];
		System.out.println("Enter BOOLEAN elements one by one");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = Util.readBoolean();
			}
		}
		Util.display(arr, row, column);
	}

	/**
	 * display = used to display given array of type string
	 * 
	 * @param arr = input to display method
	 */
	public static <T> void display(T[] arr) {
		if (arr.length == 0) {
			System.out.println("Given array is empty");
			return;
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

	/**
	 * swap = used to swap content of given string
	 * 
	 * @param arr = given string(input to swap method)
	 * @param i   = start index of string
	 * @param j   = end index of string
	 * @return
	 */
	public static String swap(String arr, int i, int j) {
		char temp;
		char[] charArray = arr.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * Recursive method which prints permutation of given string
	 * 
	 * @param arr   = input string given by user
	 * @param first = first index of string 'inputString'
	 * @param last  = last index of string 'inputString'
	 */
	public static void PermutationRecursive(String inputString, int first, int last) {
		if (first == last) {
			System.out.println(inputString);
		} else {
			for (int i = first; i <= last; i++) {
				inputString = swap(inputString, first, i);
				PermutationRecursive(inputString, first + 1, last);
				inputString = swap(inputString, first, i);
			}
		}
	}

	/**
	 * dayOfWeek = accept the date and print the day on same date
	 */
	public static void dayOfWeek() {
		System.out.println("Enter date");
		int d = sc.nextInt();
		System.out.println("Enter month");
		int m = sc.nextInt();
		System.out.println("Enter year");
		int y = sc.nextInt();

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		switch (d0) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satarday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

	}

	/**
	 * celtofah = Accepts temperature in celcius and print it in Fahrenheit
	 */
	public static void celtofah() {
		System.out.println("Enter Temperature in Celsius");
		double cel = sc.nextDouble();
		double f;
		f = (cel * 9 / 5) + 32;
		System.out.println("Temperature in Celsius = " + cel);
		System.out.println("Temperature in Fahrenheit = " + f);
	}

	/**
	 * fahtocel = Accepts temperature in Fahrenheit and print it in celcius
	 */
	public static void fahtocel() {

		System.out.println("Enter Temperature in Fahrenheit");
		double f = sc.nextDouble();
		double cel;
		cel = (f - 32) * 5 / 9;
		System.out.println("Temperature in Fahrenheit = " + f);
		System.out.println("Temperature in Celsius = " + cel);
	}

	/**
	 * temperatureConversion = used to convert temperature
	 */
	public static void temperaturConversion() {

		System.out.println("Enter your choice :\n 1) Celsius to fahrenheit\n 2) Fahrenheit to Celsius");
		int choice = Util.sc.nextInt();
		switch (choice) {
		case 1:
			celtofah();
			break;
		case 2:
			fahtocel();
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}

	/**
	 * toBinary = Converts decimal number into binary
	 */
	public static int[] toBinary(int num) {

		System.out.println("Enter the number");
		// int num = Util.sc.nextInt();
		int i = 0;
		int count = 0;
		int[] arr = new int[50];
		while (num != 1) {
			count++;
			arr[i] = num % 2;
			i++;
			num /= 2;
			// System.out.println(num);
		}
		arr[i] = num;
		for (int k = count; k >= 0; k--) {
			System.out.print(arr[k]);
		}
		return arr;
	}

	/**
	 * sqrt = It finds square root of given number
	 */
	public static void sqrt() {

		System.out.println("enter number");
		double c = Util.sc.nextDouble();
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t) + t) / 2;
		}
		System.out.println(t);
	}

	/**
	 * Method which merges given arrays of type string
	 * 
	 * @param left  = left side array of type string(first input)
	 * @param right = right side array of type string(second input)
	 * @return
	 */
	public static String[] merging(String[] left, String[] right) {
		// leftpointer = a variable to point array - 'left'
		// rightpointer = a variable to point array - 'right'
		int leftpointer = 0, rightpointer = 0;
		// sorted[] = array to store sorted strings
		String[] sorted = new String[left.length + right.length];
		int mIndex = 0;
		int comp = 0;
		while (leftpointer < left.length || rightpointer < right.length) {
			if (leftpointer == left.length) {
				sorted[mIndex++] = right[rightpointer++];
			} else if (rightpointer == right.length) {
				sorted[mIndex++] = left[leftpointer++];
			} else {
				comp = left[leftpointer].compareTo(right[rightpointer]);
				if (comp > 0) {
					sorted[mIndex++] = right[rightpointer++];
				} else if (comp < 0) {
					sorted[mIndex++] = left[leftpointer++];
				} else {
					sorted[mIndex++] = left[leftpointer++];
				}
			}
		}
		return sorted;
	}

	/**
	 * mergeSort = used to sort given strings
	 * 
	 * @param arr = input array to mergeSort procedure
	 * @return
	 */
	public static String[] mergeSort(String[] arr) {
		String[] sorted = new String[arr.length];
		if (arr.length == 1) {
			sorted = arr;
		} else {
			int mid = arr.length / 2;
			String[] left = new String[mid];
			String[] right = new String[arr.length - mid];
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}
			for (int j = 0; j < arr.length - mid; j++) {
				right[j] = arr[mid + j];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = merging(left, right);
		}
		return sorted;
	}

	/**
	 * Bubble Sort = Used to sort array
	 * 
	 * @param str = input to bubble sort
	 * @return
	 */
	public static <T extends Comparable> T[] bubbleSort(T[] str) {
		T temp;
		for (int j = 0; j < str.length; j++) {
			for (int i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		return str;
	}

	/**
	 * @param array         - Accepts array of type String
	 * @param size_of_array - Size of array
	 * @return - array of type string
	 */
	public static String[] insertionSort(String[] array, int size_of_array) {
		String temp = "";
		for (int i = 0; i < size_of_array; i++) {
			for (int j = i + 1; j < size_of_array; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	/**
	 * monthlyPayment = Prints required monthly payment according to loan amount and
	 * number of years
	 */
	public static void monthlyPayment() {

		System.out.println("Enter Number of years");
		double Y = Util.sc.nextDouble();
		System.out.println("Enter Loan amount");
		double P = Util.sc.nextDouble();
		System.out.println("Enter monthly interest rate");
		double R = Util.sc.nextDouble();
		double r = R / (12 * 100);
		double n = 12 * Y;
		double a = Math.pow((1 + r), (-n));
		double payment = (P * r) / (1 - a);
		System.out.println("Payment = " + payment);
	}

	/**
	 * Binary Search
	 * 
	 * @param words  = List of word read from file
	 * @param search = Search keyword provided by user
	 */
	public static <T extends Comparable> void Search(T[] array, T search_key) {
		bubbleSort(array);
		int l = 0, r = array.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = search_key.compareTo(array[m]);

			// Check if x is present at mid
			if (res == 0) {
				System.out.println("Item found");
				return;
			}
			// If x greater
			if (res > 0)
				l = m + 1;

			// If x is smaller
			else
				r = m - 1;
		}
		System.out.println("Item not found");
	}

	/**
	 * Purpose - Check whether given number is prime or not
	 * 
	 * @param num - Input to check num is prime or not
	 * @return prime number
	 */
	public static int[] primecheck() {
		boolean flag = false;
		int[] array = new int[168];
		int size = 0;

		for (int i = 2; i <= 1000; i++) {
			flag = true;
			for (int j = 2; j < i - 1; j++) {
				// System.out.println(i);
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				array[size] = i;
				size++;
			}
		}
		return array;
	}

	/**
	 * @Purpose - accepts array of prime numbers and prints anagram of prime numbers
	 * @param arr - Accepts array of prime numbers
	 */
	public static void isPrimeAnagram(int[] arr) {
		// TODO Auto-generated method stub
		String string1;
		String string2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				string1 = Integer.toString(arr[i]);
				string2 = Integer.toString(arr[j]);

				char[] c1 = string1.toCharArray();
				char[] c2 = string2.toCharArray();

				Arrays.sort(c1);
				Arrays.sort(c2);

				if (Arrays.equals(c1, c2)) {
					System.out.println(string1 + "\t" + string2);
				}
			}
		}
	}
	/**
	 * @Purpose - accepts array of prime numbers and returns 2D array of anagram of prime numbers
	 * @param arr -  Accepts array of prime numbers
	 * @return - 2D array of anagram of prime numbers
	 */
	public static String[][] isPrimeAnagram2D(int[] arr) {
		String arr1[][]=new String[arr.length][arr.length];

		for(int i=0;i<arr.length;i++)
		     {
		      for(int j=i+1;j<arr.length;j++)
		      {
		      String str1=Integer.toString(arr[i]);
		      String str2=Integer.toString(arr[j]);
		       
		      char[]c1=str1.toCharArray();
		      char[]c2=str2.toCharArray();
		      
		      Arrays.sort(c1);
		      Arrays.sort(c2);
		      
		      if(Arrays.equals(c1,c2))    
		      {
		    	  arr1[i][j]=str1+" "+str2;
		      }
		   }
		}return arr1;
	}

	/**
	 * @Purpose - accepts array of prime numbers and prints palindrome of prime numbers
	 * @param arr - Accepts array of prime numbers
	 */
	public static void isPrimepPalidrome(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome number");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int n = arr[i];
			int tmp = n;
			while (tmp != 0) {
				int r = tmp % 10;
				sum = sum * 10 + r;
				tmp /= 10;
			}
			if (sum == n) {
				System.out.println(" " + sum);
			}
		}
	}

	/**
	 * Purpose - Gives Number you have guessed
	 * 
	 * @param min - accepts minimum number
	 * @param max - accepts maximum number
	 */
	public static void guess(int min, int max) {
		if (min == max) {
			System.out.println("Your number is " + min);
		} else {

			System.out.println("1. Number is between " + min + " to " + ((min + max) / 2) + "\n2.Number is between "
					+ (((min + max) / 2) + 1) + " to " + max);
			int choice = Util.readInt();
			int temp = max / 2;
			System.out.println(temp);
			switch (choice) {
			case 1:
				guess(min, ((min + max) / 2));
				break;
			case 2:
				guess((((min + max) / 2) + 1), max);
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
	}

	/**
	 * Purpose - Prints prime factors of given number
	 */
	public static void factors() {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		double n = Util.readDouble();
		while (n % 2 == 0) {
			n /= 2;
			System.out.print("2\t");
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + "\t");
				n /= i;
			}
		}
		if (n > 2) {
			System.out.print(n);
		}
	}

	/**
	 * @param count - Accepts number of times you want to toss Purpose - To print
	 *              percenage haed and tail occured
	 */
	public static void flipCoin(int count) {
		// TODO Auto-generated method stub
		int H = 0, T = 0;
		double[] arr = new double[count];
		for (int i = 0; i < count; i++) {
			arr[i] = (Math.random()) * 2;
		}
		for (int i = 0; i < count; i++) {
			if (arr[i] <= 0.5)
				H++;
			else
				T++;
		}
		System.out.println("Head Percentage = " + (H * 100 / count));
		System.out.println("Tail Percentage = " + (T * 100 / count));
		System.out.print("Head Percentage = " + (H * 100 / T));
	}

	/**
	 * Purpose - finds Harmonic Number of given number
	 * 
	 * @param number - Number to find harmonic number
	 */
	public static void harmonicNumber(int number) {
		double val = 1;
		if (number == 0) {
			System.out.println("Entered number can not be Zero");
			return;
		} else {
			System.out.println("1" + "\t" + val);
			for (int i = 2; i <= number; i++) {
				val += (double) 1 / i;
				System.out.println(i + "\t" + val);
			}

		}
	}

	/**
	 * Purpose - Finds the entered year is leap year or not
	 * 
	 * @param year - Year to find leap or not
	 */
	public static void leapYear(int year) {
		// TODO Auto-generated method stub
		int test = year;
		int n = 0;
		while (test != 0) {
			test /= 10;
			++n;
		}
		if (n != 4) {
			System.out.println("Year should be 4 digit");
			return;
		} else {
			if (year % 4 == 0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not a Leap year");
			}
		}
	}

	/**
	 * Purpose - Find power of 2 of given number
	 * 
	 * @param number = Number to find power of 2
	 */
	public static void powerOf2(int number) {
		// TODO Auto-generated method stub
		if (number > 30) {
			System.out.println("Number should be less than 31");
			return;
		}
		for (int i = 0; i <= number; i++) {
			System.out.println(i + "\t" + Math.pow(2, i));
		}
	}

	/**
	 * @Purpose - Prints solution of Quadratic Equation
	 */
	public static void quadratic(int a, int b, int c) {
		// TODO Auto-generated method stub
		double delta = b * b - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("Roots of given Quadratic equation are " + x1 + " and " + x2);

	}

	/**
	 * @Purpose - Prints whether addition of three integers is zero or not
	 * @param size - size of input array
	 */
	public static void SumOfThreeIntegersAddToZero(int size) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array elements");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Util.readInt();
		}
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println("Triplet = " + arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
		System.out.println("Total count = " + count);
	}

	/**
	 * @Purpose - check given number is in power of 2 or not
	 * @param val - accepts number to check it is in power of 2 or not
	 */
	public static void isPowerOf2(int val) {
		boolean flag = false;
		for (int i = 0; i < 8; i++) {
			if (val == Math.pow(2.0, i)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("resultant number is the number is a power of 2");
		} else {
			System.out.println("resultant number is the number is not a power of 2");
		}
	}

	/**
	 * @return Nibble of a number
	 */
	public static int nibble() {
		System.out.println("Enter number for nibble");
		int nibble = Util.readInt();
		int arr[] = Util.toBinary(nibble);
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			sum = (int) (sum + arr[i] * Math.pow(2.0, i));
		}
		System.out.println(sum);
		return sum;
	}

	/**
	 * @Purpose - Used to withdraw amount from bank(with validation)
	 * @param balance - Accepts balance in bank
	 * @param amount - Accept amount of withdrawal
	 * @return - Returns current balance after tranjection
	 */
	public static long withdraw(long balance, int amount) {
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Rs."+amount+" is withdrawed");
		}
		return balance;
	}

	/**
	 * @Purpose - Used to diposite amount 
	 * @param balance - Accepts balance in bank
	 * @param amount - Accept amount of withdrawal
	 * @return - Returns current balance after tranjection
	 */
	public static long deposite(long balance, int amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		System.out.println("Rs."+amount+" is diposited");
		return balance;
	}
	

}
