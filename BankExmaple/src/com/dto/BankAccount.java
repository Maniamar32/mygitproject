package com.dto;

import java.util.Objects;

public class BankAccount {
	private int actNumber;
	private String customerName;
	private int actBalance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int actNumber, String customerName, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}

	public int getActNumber() {
		return actNumber;
	}

	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getActBalance() {
		return actBalance;
	}

	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actBalance, actNumber, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return actBalance == other.actBalance && actNumber == other.actNumber
				&& Objects.equals(customerName, other.customerName);
	}
	
	

}
