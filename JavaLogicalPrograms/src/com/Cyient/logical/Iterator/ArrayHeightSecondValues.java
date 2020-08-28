package com.Cyient.logical.Iterator;

public class ArrayHeightSecondValues {

	public static void main(String[] args) {
		Integer[] valueObj= {3,9,6,7,1,8,4};
		int temp;
		for(int i=0;i<valueObj.length;i++) {
			for(int j=i+1;j<valueObj.length;j++) {
				if(valueObj[i] > valueObj[j]) {
					
				temp=valueObj[i];
				
				valueObj[i]=valueObj[j];
				
				valueObj[j]=temp;
				
				}
			}
		}
		
		System.out.println("Array Second Height Value : "+valueObj[valueObj.length-2]);
	}

}
