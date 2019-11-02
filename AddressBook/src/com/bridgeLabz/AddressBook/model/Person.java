package com.bridgeLabz.AddressBook.model;

/**
 * @author Sourabh Magdum
 * @Purpose - Pojo class of person to read and write person.json
 *  Date- 02/11/2019
 */
public class Person {
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phone;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + "]";
	}
}
