package com.bridgeLabz.logicalPrograms;

import com.bridgeLabz.utility.Util;

public class StopWatch {
	public static void main(String[] args) 
	{
		System.out.println("To start Calculating time press 1");
		int start = Util.readInt();
		long start_time = 0;
		long end_time = 0;
		long cal_time ;
		if(start == 1 )
		{
			start_time = System.currentTimeMillis();
		}
		System.out.println("To end press 0");
		int end = Util.readInt();
		if(end == 0 )
		{
			end_time = System.currentTimeMillis();
		}
		cal_time = (end_time - start_time)/1000;
		System.out.println(cal_time+" sec");
	}
}
