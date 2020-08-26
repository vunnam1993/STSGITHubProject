package com.altimatric.logical.basedAgeCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasedOnAgeCount {
	public static void main(String[] args) {
		List<BasedOnAgeCountEmployee> list = new ArrayList<>();
		list.add(new BasedOnAgeCountEmployee("surendra", 21, 50000));
		list.add(new BasedOnAgeCountEmployee("Rajesh", 23, 60000));
		list.add(new BasedOnAgeCountEmployee("suresh", 21, 70000));
		list.add(new BasedOnAgeCountEmployee("subbu", 23, 50000));
		list.add(new BasedOnAgeCountEmployee("ramu", 24, 40000));
		list.add(new BasedOnAgeCountEmployee("suresh", 21, 50000));
		Map<Object, Integer> map = new HashMap<>();
		for (BasedOnAgeCountEmployee lists : list) {
			if (map.containsKey(lists.getAge())) {
				int count = 0;
				map.put(lists.getAge(), map.get(lists.getAge()) + 1);
			} else {
				map.put(lists.getAge(), 1);
			}
		}
		System.out.println(map);
	}
}