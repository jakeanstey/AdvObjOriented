package hr;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String firstName, lastName, gender, street, city, postal, email, department;
	private Date dateOfBirth, dateOfHire;
	private int employeeID, SIN;
	private double phone, payRate, earnings;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String email, Date dateOfBirth, int year, int month, int day, String gender, int SIN, double phone, String street, String city, String postal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = new GregorianCalendar(year, month - 1, day).getTime();
		this.gender = gender;
		this.SIN = SIN;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.postal = postal;
	}

	public Employee(String firstName, String lastName, String email, Date dateOfBirth, int year, int month, int day, int employeeID, String gender, int SIN, double phone, String street, String city, String postal, Date dateOfHire, double payRate, double earnings, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = new GregorianCalendar(year, month - 1, day).getTime();
		this.employeeID = employeeID;
		this.gender = gender;
		this.SIN = SIN;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.postal = postal;
		this.dateOfHire = dateOfHire;
		this.payRate = payRate;
		this.earnings = earnings;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public int getSIN() {
		return SIN;
	}

	public String getFullName() {
		return this.firstName + " " + lastName;
	}

	@Override
	public String toString() {
		String employeeInfo = "";
		employeeInfo += "\nName:\t\t\t" + getFullName();
		employeeInfo += "\nHire Date:\t\t" + getDateOfHire();
		return employeeInfo;
	}

}
