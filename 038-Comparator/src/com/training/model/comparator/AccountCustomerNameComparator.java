package com.training.model.comparator;

import java.util.Comparator;

import com.training.model.Account;

public class AccountCustomerNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Account account1=(Account)o1;
		Account account2=(Account)o2;
		String c1=account1.getCustomerName();
		String c2=account2.getCustomerName();
		int r=c1.compareTo(c2);
		return r;
	}

}
