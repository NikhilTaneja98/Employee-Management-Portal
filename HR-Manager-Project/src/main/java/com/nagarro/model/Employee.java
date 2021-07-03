package com.nagarro.model;

public class Employee {

	public Employee(int employeeCode, String employeeName, String location, String email, String dateofbirth) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.location = location;
		this.email = email;
		this.dateofbirth = dateofbirth;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", location=" + location
				+ ", email=" + email + ", dateofbirth=" + dateofbirth + "]";
	}

	int employeeCode;

	String employeeName;

	String location;

	String email;

	String dateofbirth;

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

}
