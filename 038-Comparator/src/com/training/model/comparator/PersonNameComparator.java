package com.training.model.comparator;

import java.util.Comparator;

import com.training.model.Person;

public class PersonNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Person person1=(Person)o1;
		Person person2=(Person)o2;
		int r=person1.getName().compareTo(person2.getName());
		return r;
	}

}
