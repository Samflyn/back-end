package com.test.four;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class One {
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("one", 1);
		mp.put("two", 2);
		mp.put("three", 3);
		mp.put("four", 4);
		mp.put("five", 5);
		Object[] i = mp.values().toArray();
		Object[] j = mp.keySet().toArray();
		Arrays.sort(i);
		System.out.println("Before sorting");
		System.out.println(mp);
		System.out.println("After sorting");
		for (int k = 0; k < i.length; k++) {
			for (int l = 0; l < i.length; l++) {
				if (mp.get(j[l]) == i[k]) {
					System.out.print(j[l] + "=" + mp.get(j[l]) + " ");
				}
			}
		}
	}
}
