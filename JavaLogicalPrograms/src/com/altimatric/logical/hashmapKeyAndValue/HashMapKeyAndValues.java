package com.altimatric.logical.hashmapKeyAndValue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapKeyAndValues {

	public static Map<Integer, String> sortByValue(Map<Integer, String> map) {
		List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return (o1.getKey()).compareTo(o2.getKey());
			}
		});

		System.out.println(list);
		
		HashMap<Integer, String> mapList = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> maps : list) {
			mapList.put(maps.getKey(), maps.getValue());

		}
		System.out.println(mapList);
		return mapList;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "surendra");
		map.put(3, "subbu");
		map.put(4, "ramu");
		map.put(9, "hello");
		map.put(8, "values");
		map.put(6, null);

		Map<Integer, String> mapSortValue = sortByValue(map);

		for (Entry<Integer, String> maps : mapSortValue.entrySet()) {
			System.out.println("key Value :" + maps.getKey() + "......." + maps.getValue());
		}
	}

}
