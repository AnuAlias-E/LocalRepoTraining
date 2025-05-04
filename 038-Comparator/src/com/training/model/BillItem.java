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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
