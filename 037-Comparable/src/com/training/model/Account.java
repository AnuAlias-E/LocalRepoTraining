package com.training.model;

public class Account implements Comparable{
	String customerName;
	double balance;

	public Account(String customerName, double balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
	}
//
//	@Override
//	public int compareTo(Object o) {
//		Account other=(Account)o;
//		int r=(this.customerName.compareTo(other.customerName));
//		return r;
//	}
	

	@Override
	public int compareTo(Object o) {
		Account other=(Account)o;
		if(this.balance<other.balance)
			return -1;
		if(this.balance>other.balance)
			return 1;
		return 0;
	}
}
