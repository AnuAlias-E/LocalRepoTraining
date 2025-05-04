package com.training.stringfun;

public class C implements A,B{

	@Override
	public void display() {
		System.out.println("hhjjh");
	}
public static void main(String[] args) {
	A obj=new C();
	(A)obj.display();
}
}
