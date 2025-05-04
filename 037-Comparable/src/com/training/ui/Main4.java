package com.training.ui;

import com.training.model.BillItem;

public class Main4 {
public static void main(String[] args) {
	BillItem item1= new BillItem("Dell Laptop", 3, 50000.00);
	BillItem item2= new BillItem("IPhone", 10, 60000.00);
	
	int r= item1.compareTo(item2);
	System.out.println(r); 
	
	if (r < 0) {
		System.out.println("Invoking object is lesser than parameter object");
	}
	if (r == 0)
		System.out.println("Invoking obj is equal to parameter object");
	if (r > 0)
		System.out.println("Invoking obj is greater than parameter object");

}
}
