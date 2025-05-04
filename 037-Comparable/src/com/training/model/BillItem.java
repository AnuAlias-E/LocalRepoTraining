package com.training.model;

public class BillItem implements Comparable {
	private String itemName;
	private int quantity;
	private double price;

	public BillItem(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

//@Override
//public int compareTo(Object o) {
//	cc
//	int r=this.itemName.compareTo(other.itemName);
//	return r;
//}
//
	@Override
	public int compareTo(Object o) {
		BillItem other = (BillItem) o;
		return this.quantity - other.quantity;
	}

//@Override
//public int compareTo(Object o) {
//	BillItem other=(BillItem)o;
//	if(this.price<other.price)
//		return -1;
//	if(this.price>other.price)
//		return 1;
//	return 0;
//}

}
