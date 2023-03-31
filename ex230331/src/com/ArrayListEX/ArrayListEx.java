package com.ArrayListEX;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add("myBaTis");
		list.add(2, "db");
		list.remove(1);
		list.set(2, "oracle");
		
		
		int size = list.size();
//		System.out.println(size);
		
		String str = list.get(2);
		
//		System.out.println(list);
//		System.out.println(str);
		
		
//		for(int i=0; i<list.size();i++) {
//			str=list.get(i);
//			System.out.println(str);
//		}
		int i = 0;
		for (String str1 : list) {
			System.out.println(i+" "+str1);
			i++;
		}
		
	}
}
