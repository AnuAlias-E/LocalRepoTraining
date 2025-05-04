package com.training.ui;

import com.training.model.BillItem;
import com.training.model.comparator.BillItemQuantityComparator;

public class Main2 {
public static void main(String[] args) {
	BillItem billItem1=new BillItem("Dell", 12, 490000.00);
	BillItem billItem2=new BillItem("Iphone", 10, 500000.00);
	
	BillItemQuantityComparator comparator=new BillItemQuantityComparator();
	
	int r=comparator.compare(billItem1, billItem2);
	System.out.println(r);
	if(r<0)
		System.out.println("Bill item1 is less than Bill item2");
	if(r==0)
		System.out.println("Bill item1 is equal to Bill item2");
	if(r>0)
		System.out.println("Bill item1 is greater than Bill item2");
}
}
