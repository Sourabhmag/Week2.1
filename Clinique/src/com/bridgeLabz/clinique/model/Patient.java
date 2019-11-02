package com.bridgeLabz.clinique.model;
/**
 * @author Sourabh Magdum
 * @Purpose - Pojo class to write and read date from patient.json
 * Date - 01/11/2019
 */
public class Patient {
	private String name;
	private int id;
	private long mobile_number;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
