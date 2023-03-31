package com.objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 * 			타입, 타입
		 * HashMap(key, value)
		 * HashMap<String, String> hashMap = new HashMap<>();
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 */
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("key","value");
		hashMap.put("key","newvalue");
		hashMap.put("key1","value1");
		hashMap.put(new String("key2"),"new value");
//		System.out.println(hashMap.get(hashMap));
		
		
		
		
		
		// 문자, 문자
		HashMap<String, String> hashMap1 = new HashMap<>();
		hashMap1.put("1","홍길동");
		hashMap1.put("2","너잘난");
		hashMap1.put("3","나잘난");
		
		
		System.out.println("1 : "+hashMap1.get("1"));
		System.out.println("2 : "+hashMap1.get("2"));
		System.out.println("3 : "+hashMap1.get("3"));
		
		HashMap<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(1,"홍길동");
		hashMap2.put(2,"너잘난");
		hashMap2.put(3,"나잘난");
		System.out.println("1 : "+hashMap2.get(1));
		System.out.println("2 : "+hashMap2.get(2));
		System.out.println("3 : "+hashMap2.get(3));
		
		
	}
}

