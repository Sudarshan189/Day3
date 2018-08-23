package com.sudarshan.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sudarshan.day3.Employee;

class EmployeeTest {

	Employee employee;
	
	@BeforeEach
	void setUp() {
		employee = new Employee(12345, "Sudarshan", 9000,500);
	}

	@AfterEach
	void tearDown() {
		employee = null;
	}

	@Test
	void testCalculateNetSalary() {
		assertEquals(12720, employee.calculateNetSalary(), 0.03);
	}
	
	

}
