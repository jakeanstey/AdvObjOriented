package hr;

import java.util.Date;

public class ComissionSalesEmployee extends Employee {
	
	private double grossSales, comissionRate;

	public ComissionSalesEmployee(String firstName, String lastName, String email, Date dateOfBirth, int year, int month, int day, String gender, int SIN, double phone, String street, String city, String postal, double grossSales, double comissionRate) {
		super(firstName, lastName, email, dateOfBirth, year, month, day, gender, SIN, phone, street, city, postal);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}
	
	public double getComissionRate(){
		return this.comissionRate;
	}
	
	public double getGrossSales(){
		return this.grossSales;
	}
	
	@Override
	public String toString(){
		String employeeInfo = "";
		employeeInfo += "\nGross Sales:\t\t" + grossSales;
		employeeInfo += "\nRate:\t\t\t" + comissionRate;
		return super.toString() + employeeInfo;
	}

}
