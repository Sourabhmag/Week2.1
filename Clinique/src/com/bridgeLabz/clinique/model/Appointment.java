package com.bridgeLabz.clinique.model;


import java.util.Date;
public class Appointment {
	private String name;
	
	private Date date;
	private int patient_count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPetaient_count() {
		return patient_count;
	}
	public void setPetaient_count() {
		this.patient_count++;
	}
	@Override
	public String toString() {
		return "Appointment [name=" + name + ", date=" + date + ", patient_count=" + patient_count + "]";
	}
}
