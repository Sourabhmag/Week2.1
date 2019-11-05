package com.bridgeLabz.creational.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {
	private String companyName;
	List<Employee> employeeList = new ArrayList<Employee>();
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Employee emp = new Employee();
			emp.setEmpId(i);
			emp.setEmpName("Employee"+i);
			getEmployeeList().add(emp);
		}
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", list=" + employeeList + "]";
	}
	@Override
	protected Company clone() throws CloneNotSupportedException {
		Company company = new Company();
		for(Employee e : getEmployeeList())
		{
			company.getEmployeeList().add(e);
		}
		return company;
	}
	
}
