package com.Cyient.logical.Iterator;

public class SingletoneClass {
	
	private static SingletoneClass instance=null;

	private SingletoneClass() {
	}
	
	public static SingletoneClass getInstance() {
		if(instance == null) {
			instance=new SingletoneClass();			
		}
		return instance;
		
	}
	
	

}
