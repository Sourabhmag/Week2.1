package com.bridgeLabz.clinique.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bridgeLabz.clinique.model.Patient;
import com.bridgeLabz.clinique.utility.Util;

public class PatientData {
	static String path = "/home/user/eclipse-workspace/Clinique/src/com/bridgeLabz/clinique/repository/patient.json";

	public static void add() {
		List<Patient> list_of_patients = Util.readPatient(path);
		Patient addPatient = new Patient();
		System.out.println("Enter name of Patient");
		addPatient.setName(Util.readString());
		System.out.println("Enter id of Patient");
		addPatient.setId(Util.readInt());
		System.out.println("Enter mobile number of Patient");
		addPatient.setMobile_number(Util.readInt());
		System.out.println("Enter age");
		addPatient.setAge(Util.readInt());
		list_of_patients.add(addPatient);
		Util.writePatient(path, list_of_patients);
	}

	public static void delete(String name) {
		boolean flag = false;
		List<Patient> list_of_patients = Util.readPatient(path);
		for (Patient i : list_of_patients) {
			if (name.equals(i.getName())) {
				flag = true;
				list_of_patients.remove(i);
				Util.writePatient(path, list_of_patients);
				System.out.println("Patient removed successfully");
				return;
			}
		}
		if (flag == false) {
			System.out.println("Patient is not present in list");
		}
	}

	public static void searchByName(String name) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getName().equals(name))
				.collect(Collectors.toList());
		if (list.get(0).getName().equals(name))
			System.out.println("Patient found");
		else
			System.out.println("Patient Not found");
	}

	public static void searchById(int id) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
		if (list.get(0).getId() == id)
			System.out.println("Patient found");
		else
			System.out.println("Patient Not found");
	}

	public static void searchByMobileNumber(int number) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getMobile_number() == number)
				.collect(Collectors.toList());
		if (list.get(0).getMobile_number() == number)
			System.out.println("Patient found");
		else
			System.out.println("Patient Not found");
	}

}
