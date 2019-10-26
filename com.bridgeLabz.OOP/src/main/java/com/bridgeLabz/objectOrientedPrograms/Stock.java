package com.bridgeLabz.objectOrientedPrograms;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Accepts Stock name,number of shares and share price.stores all data into json file
 * 				Reads data from json file and calculate total price of shares
 * Date - 24/10/2019
 */
public class Stock {

	public static void main(String[] args) throws Exception {
		String path = "/home/user/eclipse-workspace/com.BridgeLabz.OOP/src/main/java/com/BridgeLabz/ObjectOrientedPrograms/stock.json";
		System.out.println("Enter Number of Stocks");
		int NumberOfStocks = Util.readInt();
		StockPortfolio stock[] = new StockPortfolio[NumberOfStocks];
		for(int i=0;i<NumberOfStocks;i++)
		{
			if(stock[i]==null)
				stock[i] = new StockPortfolio();
			//Reads stock names
			System.out.println("Enter Stock name");
			stock[i].setStockName(Util.readString());
			
			// Reads number of shares
			System.out.println("Enter number of shares");
			stock[i].setNumberOfShares(Util.readInt());
			
			// Reads share price
			System.out.println("Enter share price");
			stock[i].setSharePrice(Util.readInt());
		}
		// Map is creatd to add items in key value pair
		Map<String,StockPortfolio> write = new HashMap<String, StockPortfolio>();
		for(int i=0;i<NumberOfStocks;i++)
		{
			// storing the key value pairs in varies array of objects of class StockPortfolio
			write.put(stock[i].getStockName(), stock[i]);
		}
		
		// writing json file
		writeJson(write,path);
		StockPortfolio stocks;
		int TotalCost[] = new int[NumberOfStocks];
		
		// Calculate individual cost of all shares of perticulare company
		for(int i=0;i<NumberOfStocks;i++)
		{
			stocks = readJson(path,stock[i].getStockName());
			TotalCost[i] = stocks.getNumberOfShares()*stocks.getSharePrice();
		}
		System.out.println("Stock Name\tTotal Price");
		int TotalSharePrice=0;
		// adding individual cost to get total share price of all companies and printing output
		for(int i=0;i<NumberOfStocks;i++)
		{
			System.out.println(stock[i].getStockName()+"\t\t\t"+TotalCost[i]);
			TotalSharePrice += TotalCost[i];
		}
		System.out.println("Total Share Price = Rs."+TotalSharePrice);
		
	}
	/**
	 * @param write - Object of Map to write into json file
	 * @param path - Path of json file
	 * @throws Exception
	 */
	public static void writeJson(Map write,String path) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(path),write);
	}
	/**
	 * @param path - path of json file
	 * @param key - Key is the search key to find perticular share
	 * @return - returns object of pojo class StockPortfolio
	 * @throws Exception
	 */
	public static StockPortfolio readJson(String path,String key) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		Map<String,StockPortfolio> read = mapper.readValue(new File(path),new TypeReference<Map<String, StockPortfolio>>() {
		});
		
		StockPortfolio stock = (StockPortfolio)read.get(key);
		
		
		return stock;
	}

}
