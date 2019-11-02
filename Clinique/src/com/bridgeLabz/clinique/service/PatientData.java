package com.bridgeLabz.clinique.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bridgeLabz.clinique.model.Patient;
import com.bridgeLabz.clinique.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Used to handle operations of patient
 * Date - 01/11/2019
 */
public class PatientData {
	static String path = "/home/user/eclipse-workspace/Clinique/src/com/bridgeLabz/clinique/repository/patient.json";

	/**
	 * @Purpose - Used to add patient
	 */
	public static void add() {
		List<Patient> list_of_patients = Util.readPatient(path);
		Patient addPatient = new Patient();
		System.out.println("Enter name of Patient");
		addPatient.setName(Util.readString());
		System.out.println("Enter id of Patient");
		addPatient.setId(Util.readInt());
		System.out.println("Enter mobile number of Patient");
		addPatient.setMobile_number(Util.readLong());
		System.out.println("Enter age");
		addPatient.setAge(Util.readInt());
		list_of_patients.add(addPatient);
		Util.writePatient(path, list_of_patients);
		System.out.println("Patient added successfully");
	}
	/**
	 * @Purpose - Used to delete patient
	 */
	public static boolean delete(String name) {
		List<Patient> list_of_patients = Util.readPatient(path);
		for (Patient i : list_of_patients) {
			if (name.equals(i.getName())) {
				list_of_patients.remove(i);
				Util.writePatient(path, list_of_patients);
				return true;
			}
		}
		return false;
	}
	/**
	 * @Purpose - Used to search patient by name
	 */
	public static boolean searchByName(String name) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getName().equals(name))
				.collect(Collectors.toList());
		if (list.isEmpty()==false) {
			System.out.println("in patient in null");
			System.out.println(list);
			if (list.get(0).getName().equals(name))
				return true;
			else
				return false;
		}
		return false;
	}
	/**
	 * @Purpose - Used to search patient by id
	 */
	public static boolean searchById(int id) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
		if (list.isEmpty()==false) {
			if (list.get(0).getId() == id)
				return true;
			else
				return false;
		}
		return false;
	}
	/**
	 * @Purpose - Used to search patient by mobile number
	 */
	public static boolean searchByMobileNumber(long number) {
		List<Patient> list_of_patients = Util.readPatient(path);
		List<Patient> list = list_of_patients.stream().filter(i -> i.getMobile_number() == number)
				.collect(Collectors.toList());
		if (list.isEmpty()==false) {
			if (list.get(0).getMobile_number() == number)
				return true;
			else
				return false;
		}
		return false;
	}

}
