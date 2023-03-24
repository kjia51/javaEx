package com.kh.object.practice;

public class NonStaticSample {
	public void printLottoNumbers() {
 // 출력은 되나 중복값 해결이 불가
		int[] arrList = new int[6];
		for (int i=0; i<6; i++) {
			arrList[i] = (int)(Math.random()*45)+1;
			for (int num:arrList) {
				if(num!=arrList[i]) {
					num=arrList[i];
					System.out.print(num+" ");
					break;
				} 
			}
		}
		System.out.println();
		
			
			}

	public void outputChar(int num, char c) {
		System.out.print("============2번============\n");
		System.out.print(c+"문자 "+num+"개 출력 : ");
		for (int i=0; i<num; i++) {
			System.out.printf(c+" ");
		}
		System.out.println();
	}
	
	public char alphabette() {
		while(true) {
			int i= (int)(Math.random()*122+1);
			if (i>=65 && i<=122) {
//				char value = Integer.toString(i).charAt(0);
				return (char)i;	
		}
		}
	}
	
	public String mySubstring(String str, int index1, int index2) {
		System.out.print("============4번============\n");
		if(str!=null) {
			String str1 = str.substring(index1, index2);
			System.out.printf(str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값 출력 : ");
			return str1;
		} else{
			return null;
		}
	}
	
}
