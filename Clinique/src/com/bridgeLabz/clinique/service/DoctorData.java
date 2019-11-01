package com.bridgeLabz.clinique.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bridgeLabz.clinique.model.*;
import com.bridgeLabz.clinique.utility.Util;

public class DoctorData {
	static String path = "/home/user/eclipse-workspace/Clinique/src/com/bridgeLabz/clinique/repository/doctor.json";

	public static void add() {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		Doctor addDoctor = new Doctor();
		System.out.println("Enter name of Doctor");
		addDoctor.setName(Util.readString());
		System.out.println("Enter id of doctor");
		addDoctor.setId(Util.readInt());
		System.out.println("Enter Specilization of doctor");
		addDoctor.setSpecilization(Util.readString());
		addDoctor.setAvaliability();
		list_of_doctors.add(addDoctor);
		Util.writeDoctor(path, list_of_doctors);
		System.out.println("Doctor added successfully");
	}

	public static boolean delete(String doctorName) {

		List<Doctor> list_of_doctors = Util.readDoctor(path);
		for (Doctor i : list_of_doctors) {
			if (doctorName.equals(i.getName())) {
				list_of_doctors.remove(i);
				Util.writeDoctor(path, list_of_doctors);
				return true;
			}
		}
		return false;

	}

	public static boolean searchByName(String doctorName) {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		List<Doctor> list = list_of_doctors.stream().filter(i -> i.getName().equals(doctorName))
				.collect(Collectors.toList());
		if (list.isEmpty()==false) {
			if (list.get(0).getName().equals(doctorName)) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public static boolean searchById(int id) {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		List<Doctor> list = list_of_doctors.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
		if (list.isEmpty()==false) {
			if (list.get(0).getId() == id)
				return true;
			else
				return false;
		}
		return false;
	}

	public static void checkAvaliabilityByName(String name) {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		List<Doctor> list = list_of_doctors.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());
		if (list.isEmpty()==false)
			System.out.println(list.get(0).getAvaliability());
	}

	public static void checkAvaliabilityById(int id) {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		List<Doctor> list = list_of_doctors.stream().filter(i -> i.getId() == id).collect(Collectors.toList());
		if (list.isEmpty()==false)
			System.out.println(list.get(0).getAvaliability());
	}

	public static void searchBySpecialization(String specialization) {
		List<Doctor> list_of_doctors = Util.readDoctor(path);
		List<Doctor> list = list_of_doctors.stream().filter(i -> i.getSpecilization().equals(specialization))
				.collect(Collectors.toList());
		if (list.isEmpty()==false) {
			for (Doctor d : list) {
				System.out.println("Name :" + d.getName() + "\t Id :" + d.getId());
			}
		}
	}

	

}
