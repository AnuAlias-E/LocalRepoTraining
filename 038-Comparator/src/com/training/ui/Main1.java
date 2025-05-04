package com.training.ui;

import com.training.model.BillItem;
import com.training.model.comparator.BillItemPriceComparator;

public class Main1 {
public static void main(String[] args) {
	BillItem billItem1=new BillItem("Dell", 12, 490000.00);
	BillItem billItem2=new BillItem("Iphone", 10, 500000.00);
	
	BillItemPriceComparator comparator=new BillItemPriceComparator();
	int r=comparator.compare(billItem1, billItem2);
	System.out.println(r);
	if(r<0)
		System.out.println("Bill item1 price is less than Bill item2 price");
	if(r==0)
		System.out.println("Bill item1 priceis equal to Bill item2price");
	if(r>0)
		System.out.println("Bill item1 price is greater than Bill item2 price");
}
}
