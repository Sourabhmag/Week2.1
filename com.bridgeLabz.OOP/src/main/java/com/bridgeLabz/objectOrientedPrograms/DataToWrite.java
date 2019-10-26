package com.bridgeLabz.objectOrientedPrograms;

public class DataToWrite {
	private String name;
	private int weight;
	private int pricePerKG;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPricePerKG() {
		return pricePerKG;
	}

	public void setPricePerKG(int pricePerKG) {
		this.pricePerKG = pricePerKG;
	}

	@Override
	public String toString() {
		return "Name :" + name + "\nweight :" + weight + "\nPrice :" + pricePerKG ;
	}

}