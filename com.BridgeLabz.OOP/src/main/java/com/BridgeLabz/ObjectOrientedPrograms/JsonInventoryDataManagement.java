package com.BridgeLabz.ObjectOrientedPrograms;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

/**
 * @author Sourabh Magdum
 * @Purpose - Reads data from JSON file and calculate cost of goods Date -
 *          24/10/2019
 */
public class JsonInventoryDataManagement {
	/**
	 * path - Path of file
	 */
	static String path = "/home/user/eclipse-workspace/com.BridgeLabz.OOP/src/main/java/com/BridgeLabz/ObjectOrientedPrograms/jsonInventoryDataManagement.json";

	public static void main(String[] args) throws Exception {
		
		readJson();

	}

	public static void readJson() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		// Map is used to read values from json
		Map<String, DataToWrite> read = mapper.readValue(new File(path), new TypeReference<Map<String, DataToWrite>>() {
		});
		DataToWrite RiceData = (DataToWrite) read.get("Entity 1");
		DataToWrite PulsesData = (DataToWrite) read.get("Entity 3");
		DataToWrite WheatData = (DataToWrite) read.get("Entity 2");

		JsonObject cost = new JsonObject();
		cost.addProperty("Cost of Wheat",(WheatData.getWeight() * WheatData.getPricePerKG()));
		cost.addProperty("Cost of Rice",(RiceData.getWeight() * RiceData.getPricePerKG()));
		cost.addProperty("Cost of Pulses",(PulsesData.getWeight() * PulsesData.getPricePerKG()));
		System.out.println(cost.toString());

	}
}
