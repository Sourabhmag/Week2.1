package com.BridgeLabz.ObjectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccount{
	public <T> T readJson(String path,String key) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		Map<String,T> read = mapper.readValue(new File(path),new TypeReference <Map<String, T>>() {
		});
		T obj = (T)(read.get(key));
		return obj;
	}
	public void stockAccount(String path)
	{
		
	}
	public double valueOf()
	{
		
	}
	void buy(int amount,String symbol)
	{
		
	}
	void sell(int amount,String symbol)
	{
		
	}
	void save(String path)
	{
		
	}
	void printReport()
	{
		
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String path ="";
		StockAccount object = new StockAccount();
		object.stockAccount(path);
		object.readJson(path,"");
	}

}
