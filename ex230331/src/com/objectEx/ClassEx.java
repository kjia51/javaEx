package com.objectEx;

public class ClassEx {
	public static void main(String[] args) {
		Class clazz = Car.class;
		

		try {
			
			//해당 경로(패키지를 포함한 클래스이름)에
			// 클래스가 존재할 경우 클래스 반환
			
			// 라이브러리가 잘 로드되었는지 확인할때 사용

			//라이브러리가 로드도있는데 확인 할때 사용
			clazz = Class.forName("com.objectEx.car");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			
			// 클래스 경로를 활용하여 리소스 절대경로 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
			
		
			} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보 얻기 실패");
			}
		
	}
	
	
}
