package com.sudarshan.day3;

import java.time.LocalTime;

public class EmployeeAttendance {

	private long employeeId;
	private String firstName;
	private String lastName;
	private String designation;

	private LocalTime inTime;
	private LocalTime outTime;
	private LocalTime labInTime;
	private LocalTime labOutTime;

	private boolean employeeStatusOffice;
	private boolean employeeStatusLab;

	public EmployeeAttendance() {

	}

	public EmployeeAttendance(long employeeId, String firstName, String lastName, String designation) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	public EmployeeAttendance getEmployeeDetails() {
		return new EmployeeAttendance(employeeId, firstName, lastName, designation);
	}

	public boolean checkIn(long employeeId) {
		if (this.employeeId == employeeId && !employeeStatusOffice) {
			inTime = LocalTime.now();
			employeeStatusOffice = true;
			printIntime();
			return employeeStatusOffice;
		}
		return false;
	}

	public boolean checkOut(long employeeId) {
		if (this.employeeId == employeeId && employeeStatusOffice) {
			outTime = LocalTime.now();
			employeeStatusOffice = false;
			printOutTime();
			return employeeStatusOffice;
		}
		return true;
	}

	public boolean labCheckIn(long employeeId) {
		if (this.employeeId == employeeId && employeeStatusOffice && !employeeStatusLab && employeeStatusOffice) {
			labInTime = LocalTime.now();
			employeeStatusLab = true;
			printLabInTime();
			return employeeStatusLab;
		}
		return false;
	}

	public boolean labCheckOut(long employeeId) {
		if (this.employeeId == employeeId && employeeStatusOffice && employeeStatusLab && employeeStatusOffice) {
			labOutTime = LocalTime.now();
			employeeStatusLab = false;
			printLabOutTime();
			return employeeStatusLab;
		}
		return true;
	}

	private void printIntime() {
		System.out.println("In Time: " + inTime);
	}

	private void printOutTime() {
		System.out.println("Out Time: " + outTime);
	}

	private void printLabInTime() {
		System.out.println("Lab In Time: " + labInTime);
	}

	private void printLabOutTime() {
		System.out.println("Lab Out Time: " + labOutTime);
	}

}
