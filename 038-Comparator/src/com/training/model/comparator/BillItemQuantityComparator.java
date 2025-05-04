package com.training.model.comparator;

import java.util.Comparator;

import com.training.model.BillItem;
public class BillItemQuantityComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		BillItem item1=(BillItem)o1;
		BillItem item2=(BillItem)o2;
		
		if(item1.getQuantity()<item2.getQuantity())
			return -1;
		if(item1.getQuantity()>item2.getQuantity())
			return 1;
		return 0;
	}

}
