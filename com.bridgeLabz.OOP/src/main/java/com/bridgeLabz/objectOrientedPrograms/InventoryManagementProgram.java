package com.bridgeLabz.objectOrientedPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

/**
 * @author Sourabh Magdum
 * @Purpose - Read data from file and prits total bill
 * Date - 29/10/2019
 */
public class InventoryManagementProgram {

	public static void main(String[] args) throws Exception {
		String path = "/home/user/eclipse-workspace/com.BridgeLabz.OOP/src/main/java/com/BridgeLabz/ObjectOrientedPrograms/inventoryDataManagement.json";
		readJson(path,"rice 1");
		JsonObject cost = new JsonObject();
		Inventory object;
		String []key = {"rice 1","rice 2","rice 3","wheat 1","wheat 2"};
		int TotalCost[] = new int[5];
		for(int i=0;i<5;i++)
		{
			object = readJson(path, key[i]);
			TotalCost[i]=object.getWeight()*object.getPricePerKg();

			cost.addProperty("Cost of "+object.getName(),TotalCost[i]);
			
		}
		System.out.println(cost.toString());
		
	}
	/**
	 * @param path
	 * @param key
	 * @return Returns object of type Inventory
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static Inventory readJson(String path,String key) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Map<String,Inventory> read = mapper.readValue(new File(path),new TypeReference<Map<String,Inventory>>(){});
		Inventory obj = (Inventory)(read.get(key));
		
		return obj;
	}
}
