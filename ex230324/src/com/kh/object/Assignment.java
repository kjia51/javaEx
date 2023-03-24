package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Assignment {
	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample(); 
		sample.printLottoNumbers();
		
		
		sample.outputChar(5,'a');
		
		
		System.out.println("============3번============");
		System.out.println(sample.alphabette());
		
		String str1 = sample.mySubstring("apple", 2, 4);
		System.out.println(str1);
		

		
	}
	
}
