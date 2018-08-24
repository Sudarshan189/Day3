package com.sudarshan.day3;

public class BankAccount {

	private long accId; // needs initialization compulsory else default values will be assigned
	private String accHolderName;
	private String accType;
	private double balance;

	public static final String BANK_NAME = "HDFC"; // static are only one copy will be their
	public static long totalAccounts;

	public BankAccount() {
		totalAccounts++;
	}

	public BankAccount(long accId, String accHolderName, String accType, double balance) {
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
		totalAccounts++;
		System.out.println(totalAccounts);
	}

	public double withdraw(double amount) {
		if (balance - amount >= 0)
			balance = balance - amount;
		else
			System.out.println("No sufficient balance..");
		return balance;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public void displayBankAccountDetails() {
		System.out.println("Account Id : " + accId + "\nAccount Holder Name: " + accHolderName + "\nAccount type: "
				+ accType + "\nAccount balance: " + balance);
	}

	public static long totalBankAccounts() {
		return totalAccounts;
	}
}
