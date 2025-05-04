package com.training.ui;

import com.training.model.Person;
import com.training.model.comparator.PersonNameComparator;

public class Main4 {
public static void main(String[] args) {
	Person person1=new Person("Anju", 10);
	Person person2=new Person("Anju", 10);
	
	PersonNameComparator comparator=new PersonNameComparator();
	int r=comparator.compare(person1, person2);
	System.out.println(r);
	if(r<0)
		System.out.println("Person1 name is less than Person2 name");
	if(r==0)
		System.out.println("Person1 name is equal to Person2 name");
	if(r>0)
		System.out.println("Person1  name is greater than Person2 name");
	
	
}
}
