package loof;

public class LoofFor {

	public static void main(String[] args) {
		// 반복문 - for문
		// for(초기식; 조건식; 증감식){}
		// 초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식
		// 1~100까지의 합을 구해봅시다
		int sum=0;
		
		//i+=2 2씩 증가
		for(int i=0; i<=100; i++) {
			System.out.println("for문 "+i);
			sum += i;
			
		}
		System.err.println("1부터100까지의 합:"+ sum);
		
		int i =0;
		while(i<5) {
			i++;
			System.out.println("whiㅣe 출력" + i);
		}
		
	}
	

}
