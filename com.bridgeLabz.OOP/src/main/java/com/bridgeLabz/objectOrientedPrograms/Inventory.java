package com.bridgeLabz.objectOrientedPrograms;

/**
 * @author Sourabh Magdum
 * @Purpose - Pojo class for Inventory
 * Date - 29/10/2019
 */
public class Inventory {
	private String name;
	private int weight;
	private int pricePerKg;
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
	public int getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg + "]";
	}
}
