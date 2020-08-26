package com.altimatric.logical.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(13);
		list.add(22);
		System.out.println(list);
		
		Iterator<Integer> iterator=list.iterator();
	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
