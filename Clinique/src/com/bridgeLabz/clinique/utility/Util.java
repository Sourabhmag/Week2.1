package com.bridgeLabz.clinique.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeLabz.clinique.model.Appointment;
import com.bridgeLabz.clinique.model.Doctor;
import com.bridgeLabz.clinique.model.Patient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	static ObjectMapper mapper = new ObjectMapper();
	static Scanner sc = new Scanner(System.in);
	/**
	 * @return Integer value read from user
	 */

	public static int readInt() {

		boolean flag = false;
		int value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Integer.parseInt(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct integer value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Long value read from user
	 */
	public static long readLong() {

		boolean flag = false;
		long value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Long.parseLong(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct integer value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Double value read from user
	 */
	public static double readDouble() {
		boolean flag = false;
		double value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Double.parseDouble(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct double value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Float value read from user
	 */
	public static float readFloat() {
		boolean flag = false;
		float value_to_be_returned = 0;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Float.parseFloat(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct float value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return Boolean value read from user
	 */
	public static boolean readBoolean() {
		boolean flag = false;
		boolean value_to_be_returned = false;
		do {
			try {
				String value = sc.nextLine();
				value_to_be_returned = Boolean.parseBoolean(value);
				flag = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter correct Boolean value");
			}
		} while (flag != true);
		return value_to_be_returned;
	}

	/**
	 * @return String value read from user
	 */
	public static String readString() {
		return sc.nextLine();
	}
	/**
	 * @Purpose - Read doctor.json and returns list of doctors
	 * @param path - path pf doctor.json
	 * @return - list of doctor
	 */
	public static List <Doctor>readDoctor(String path)
	{
		List<Doctor> list_of_doctors=null;
		try {
			list_of_doctors = mapper.readValue(new File(path),new TypeReference<List<Doctor>>() {
			});
			return list_of_doctors;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_of_doctors;
	}
	/**
	 * @Purpose - Read patient.json and returns list of patients
	 * @param path - path pf patient.json
	 * @return - list of patients
	 */
	public static List <Patient>readPatient(String path)
	{
		List<Patient> list_of_patients=null;
		try {
			list_of_patients = mapper.readValue(new File(path),new TypeReference<List<Patient>>() {
			});
			return list_of_patients;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_of_patients;
	}
	public static List <Appointment>readAppointment(String path)
	{
		List<Appointment> list_of_appointment=new ArrayList<Appointment>();
		try {
			list_of_appointment = mapper.readValue(new File(path),new TypeReference<List<Object>>() {
			});
			return list_of_appointment;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_of_appointment;
	}
	public static void writeDoctor(String path,List<Doctor> list_of_doctors)
	{
		try {
			mapper.writeValue(new File(path),list_of_doctors);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeAppointment(String path,List<Appointment> list_of_appointment)
	{
		try {
			mapper.writeValue(new File(path),list_of_appointment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writePatient(String path,List<Patient> list_of_patients)
	{
		try {
			mapper.writeValue(new File(path),list_of_patients);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
