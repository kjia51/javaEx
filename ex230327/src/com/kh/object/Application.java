package com.kh.object;

import com.kh.object.practice.LottoNumber;
import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticSample sample = new NonStaticSample();
		sample.LottoNumbers();
		sample.outputChar(2,'c');

		System.out.println(sample.alphabette());
		System.out.println(sample.mySubstring("apple",2,4));
		LottoNumber lotto = new LottoNumber();
		lotto.LottoNumbers();
	}

}
