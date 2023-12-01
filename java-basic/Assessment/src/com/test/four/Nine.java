package com.test.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nine {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "Servlets", "JDBC", "CoreJava", "Hibernate");
		List<String> list2 = Arrays.asList("Java", "Servlets", "JDBC", "CoreJava", "Spring", "JSP");
		List<String> list3 = new ArrayList<String>(list2);
		list3.retainAll(list1);
		System.out.println(list3);
	}
}