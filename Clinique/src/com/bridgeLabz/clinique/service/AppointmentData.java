package com.bridgeLabz.clinique.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bridgeLabz.clinique.model.Appointment;
import com.bridgeLabz.clinique.utility.Util;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppointmentData {
	static String path = "/home/user/eclipse-workspace/Clinique/src/com/bridgeLabz/clinique/repository/appointment.json";
	static ObjectMapper mapper = new ObjectMapper();
	public static void getAppointment(String name) {
		Date date = new Date();
		//System.out.println(date);
		boolean flag = false;
		List<Appointment> list_of_appointment = Util.readAppointment(path);
		
		 for(int i=0;i<list_of_appointment.size();i++) {
			 // temp = mapper.convertValue(list_of_appointment.get(i), Appointment.class);
		 /*if(list_of_appointment.get(i).getName().equals(name) &&
		 list_of_appointment.get(i).getPetaient_count()<5) { System.out.println("hey");}}
		 */
			 System.out.println(list_of_appointment.get(i));
		 }
		/*
		 * for (Appointment i : list_of_appointment) { if (i.getName().equals(name) &&
		 * i.getDate() == date && i.getPetaient_count() < 5) { flag = true;
		 * i.setPetaient_count(); Util.writeAppointment(name, list_of_appointment);
		 * System.out.println("Your appointment is fixed with Dr." + name); } }
		 */

//		if (flag == false) {
//			Appointment nextday = new Appointment();
//			nextday.setName(name);
//			nextday.setDate(date);
//			int j = 1;
//			for (Appointment i : list_of_appointment) {
//				LocalDate today = LocalDate.now();
//				LocalDate date1 = today.plusDays(j);
//				if (i.getName().equals(name) && i.getDate() == date1 && i.getPetaient_count() < 5) {
//					flag = true;
//					i.setPetaient_count();
//					Util.writeAppointment(name, list_of_appointment);
//					System.out.println("Your appointment is fixed with Dr." + name);
//				}
//			}
//		}
	}

	public static void set() {
		Date date = new Date();
		Appointment nextday = new Appointment();
		nextday.setName(Util.readString());
		nextday.setDate(date);
		List<Appointment> list = new ArrayList<Appointment>();
		list.add(nextday);
		Util.writeAppointment(path, list);
	}
}
