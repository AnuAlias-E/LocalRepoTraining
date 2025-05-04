package com.training.ui;

import com.training.model.Account;
import com.training.model.comparator.AccountCustomerNameComparator;

public class Main3 {
public static void main(String[] args) {
	Account account1=new Account("AbcCompany", 1000.00);
	Account account2=new Account("XYZCompany", 2000.00);
	
	AccountCustomerNameComparator comparator=new AccountCustomerNameComparator();
	
	int r=comparator.compare(account1, account2);
	System.out.println(r);
	if(r<0)
		System.out.println("Account1 Name is less than Account2 Name");
	if(r==0)
		System.out.println("Account1 Name is same as Account2 Name");
	if(r>0)
		System.out.println("Account1 Name is greater Account2 Name");
	
}
}
