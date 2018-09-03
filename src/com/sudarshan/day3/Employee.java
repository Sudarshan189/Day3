package com.sudarshan.day3;

public class Employee {
	public static final double PRIVATE_TAX = 200;

	private long employeeId;
	private String employeeName;
	private double basicSalary;
	private double netSalary;
	private static final double MEDICAL = 500;
	private double hra;
	private double pf;
	private double grossSalary;

	public Employee() {
	}

	public Employee(long employeeId, String employeeName, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public double calculateNetSalary() {
		hra = 0.5 * basicSalary;
		pf = 0.12 * basicSalary;
		grossSalary = hra + basicSalary + MEDICAL;

		netSalary = grossSalary - pf - PRIVATE_TAX;
		displayEmployeeInformation();
		return netSalary;
	}

	public void displayEmployeeInformation() {
		System.out.println(
				"Employee Id: " + employeeId + "\nEmployee Name: " + employeeName + "\nNet Salary: " + netSalary);
	}

}
