package com.bridgeLabz.objectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.jar.JarException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccount{
	int NumberOfSharesCanBuy;
	int TotalAmount;
	String path ="";
	public Map readStockHolders() throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		Map<String,StockHolders> readStockHolders = mapper.readValue(new File(path),new TypeReference<Map<String, StockHolders>>() {
		});
		return readStockHolders;
	}
	public Map readcompanies() throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Companies> readCompanies = mapper.readValue(new File(path),new TypeReference<Map<String, Companies>>() {
		});
		return readCompanies;
	}
	public void stockAccount(String path)
	{
		
	}
	public double valueOf()
	{
		return 2.2;
	}
	public void buy(int amount,String symbol) throws Exception
	{
		Companies readCompany = (Companies)readcompanies().get(symbol);
		StockHolders readStockHolder = (StockHolders)readStockHolders().get(name);
		if(readStockHolder.getAmount()<amount)
		{
			System.out.println("Entered amount is greater then your balance amount");
			return;
		}
		else
		{
			int PricePerShare = readCompany.getPrice();
			if(amount<PricePerShare)
			{
				System.out.println("Entered amount is less than one share price");
				return;
			}
			else 
			{
				NumberOfSharesCanBuy = amount/PricePerShare;
				if(readCompany.getShares()<NumberOfSharesCanBuy)
				{
					System.out.println("Required Number of shares are not avaliable");
				}
				TotalAmount = NumberOfSharesCanBuy*PricePerShare;
				
			}
		}
		
	}
	void sell(int amount,String symbol)
	{
		Companies readCompany = (Companies)readcompanies().get(symbol);
		StockHolders readStockHolder = (StockHolders)readStockHolders().get(name);
		int NumberOfsharesAvaliable = readStockHolder.getCompany();
		if(amount>NumberOfsharesAvaliable*readCompany.getPrice())
		{
			System.out.println("Sufficient number of shares are not avaliable");
			return;
		}
		else
		{
			    
		}
	}
	void save(String path)
	{
		
	}
	void printReport()
	{
		
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		StockAccount object = new StockAccount();
		object.stockAccount(path);
		object.readJson(path,"");
	}

}
