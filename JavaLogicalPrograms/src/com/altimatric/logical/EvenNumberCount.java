package com.altimatric.logical;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;

public class EvenNumberCount {

	public int countPrimeNumber(String str) {
		int countPrime = 0;
		char[] ch = str.toCharArray();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= ch.length - 1; i++) {
			int value = Integer.parseInt(String.valueOf(ch[i]));
			list.add(value);
		}
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == 2 || list.get(i) == 3 || list.get(i) == 5 || list.get(i) == 7) {
				countPrime = countPrime + list.get(i);
			}

		}

		

		System.out.println(list);

		return countPrime;

	}

	public static void main(String[] args) {
		EvenNumberCount evenNumberCount = new EvenNumberCount();
		System.out.println(evenNumberCount.countPrimeNumber("34565587"));;
		System.out.println(evenNumberCount.countPrimeNumber("993883268628376856238"));
		System.out.println(evenNumberCount.countPrimeNumber("0123456789"));
	}

}
