package com.bridgeLabz.dataStructurePrograms;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Check whether the entered expression is balanced or not
 *  Date - 18/10/2019
 */
public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Expression");
		String expression = Util.readString();
		char []array = new char[expression.length()];
		for(int i=0;i<array.length;i++)
		{
			if(expression.charAt(i)=='(')
			{
				Util.push('(');
			}
			
		}
		for(int i=0;i<array.length;i++)
		{
			if(expression.charAt(i)==')')
			{
				Util.pop();
			}
		}
		if(Util.isEmpty()==true)
		{
			System.out.println("Given Expression is balanced");
		}
		else
		{
			System.out.println("Given Expression is not balanced");
		}
		
	}

}
