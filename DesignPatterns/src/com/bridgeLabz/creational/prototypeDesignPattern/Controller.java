package com.bridgeLabz.creational.prototypeDesignPattern;

public class Controller {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setCompanyName("Infosys");
		company.loadData();
	
		Company newCompany = (Company) company.clone();
		company.getEmployeeList().remove(2);
		newCompany.setCompanyName("Microsoft");
		
		System.out.println(company);
		System.out.println(newCompany);
	}

}
