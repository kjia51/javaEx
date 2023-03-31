package com.objectEx;

public class SystemEx {
	public static void main(String[] args) throws InterruptedException {
		//수행시간 구하기
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0;i<5;i++) {
			sum+=i;
		
			if (i==4) {
				//.JVM 강제종료
				System.exit(0);
			}
			Thread.sleep(1000);
		}
		System.out.println("sum : "+ sum);
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000+"초 소요되었습니다");
	}
}
