package com.bridgeLabz.clinique.controller;


import com.bridgeLabz.clinique.service.AppointmentData;
import com.bridgeLabz.clinique.service.DoctorData;
import com.bridgeLabz.clinique.service.PatientData;
import com.bridgeLabz.clinique.utility.Util;

public class Clinique {

	public static void main(String[] args) {
		System.out.println("1)Add Doctor\n2)Add Patient\n3)Search Doctor by Name\n4)Search Doctor by id\n"
				+ "5)Delete Doctor\n6)Search Patient by Name\n7)Search Patient by id\n8)Delete Patient\n9)"
				+ "Search Patient by Mobile Number\n10)Check Avaliability of Doctor by name\n"
				+ "11)Check Avaliability of Doctor by Id\n12)Search Doctor by Specialization"
				+ "\n13)Get an appointment\n14)Exit");

		int choice = Util.readInt();
		switch (choice) {
		case 1:
			DoctorData.add();
			main(args);
			break;
		case 2:
			PatientData.add();
			main(args);
			break;
		case 3:
			System.out.println("Enter name of doctor");
			if (DoctorData.searchByName(Util.readString()))
				System.out.println("Doctor is Present");
			else
				System.out.println("Doctor is not Present");
			main(args);
			break;
		case 4:
			System.out.println("Enter id of doctor");
			if (DoctorData.searchById(Util.readInt()))
				System.out.println("Doctor is Present");
			else
				System.out.println("Doctor is not Present");
			main(args);
			break;
		case 5:
			System.out.println("Enter name of doctor");
			if (DoctorData.delete(Util.readString()))
				System.out.println("Doctor deleted successfully");
			else
				System.out.println("Doctor is not deleted");
			main(args);
			break;
		case 6:
			System.out.println("Enter name of patient");
			if (PatientData.searchByName(Util.readString()))
				System.out.println("patient is Present");
			else
				System.out.println("patient is not Present");
			main(args);
			break;
		case 7:
			System.out.println("Enter id of patient");
			if (PatientData.searchById(Util.readInt()))
				System.out.println("patient is Present");
			else
				System.out.println("patient is not Present");
			main(args);
			break;
		case 8:
			System.out.println("Enter name of patient");
			if (PatientData.delete(Util.readString()))
				System.out.println("patient deleted successfully");
			else
				System.out.println("patient is present");
			main(args);
			break;
		case 9:
			System.out.println("Enter mobile number of patient");
			if (PatientData.searchByMobileNumber(Util.readLong()))
				System.out.println("patient is Present");
			else
				System.out.println("patient is not Present");
			main(args);
			break;
		case 10:
			System.out.println("Enter name of Doctor");
			DoctorData.checkAvaliabilityByName(Util.readString());
			main(args);
			break;
		case 11:
			System.out.println("Enter Id of Doctor");
			DoctorData.checkAvaliabilityById(Util.readInt());
			main(args);
			break;
		case 12:
			System.out.println("Enter specialization");
			DoctorData.searchBySpecialization(Util.readString());
			main(args);
			break;
		case 13:
			System.out.println("Enter name of Doctor");
			//AppointmentData.set();
			AppointmentData.getAppointment(Util.readString());
			main(args);
			break;
		case 14:
			System.exit(1);
		default:
			main(args);
		}
	}

}
