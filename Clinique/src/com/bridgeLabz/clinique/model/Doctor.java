package com.bridgeLabz.clinique.model;

import com.bridgeLabz.clinique.utility.Util;

public class Doctor {
private String name;
private int id;
private String specilization;
private String avaliability;
private int patient_count;
public int getPatient_count() {
	return patient_count;
}
public void setPatient_count() {
	this.patient_count++;
}
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
public String getSpecilization() {
	return specilization;
}
public void setSpecilization(String specilization) {
	this.specilization = specilization;
}
public String getAvaliability() {
	return avaliability;
}
public void setAvaliability() {
	System.out.println("Enter your choice\n1)AM\n2)PM\n3)Both");
	int choice= Util.readInt();
	switch(choice)
	{
	case 1 :avaliability="AM";break;
	case 2 :avaliability = "PM";break;
	case 3 :avaliability = "Both";break;
	default :setAvaliability();
	}
	
}
@Override
public String toString() {
	return "name=" + name + "\nid=h" + id + ", specilization=" + specilization + ", avaliability=" + avaliability
			+ "]";
}
}
