package com.training.ui;

import com.training.model.Account;

public class Main5 {
public static void main(String[] args) {
	Account account1 = new Account("Nelson", 5000.00);
	Account account2 = new Account("Anu Alias", 6000.00);
	
	int r=account1.compareTo(account2);
	
	if (r < 0) {
		System.out.println("Invoking object is lesser than parameter object");
	}
	if (r == 0)
		System.out.println("Invoking obj is equal to parameter object");
	if (r > 0)
		System.out.println("Invoking obj is greater than parameter object");

}
}
