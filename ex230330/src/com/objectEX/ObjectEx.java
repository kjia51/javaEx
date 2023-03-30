package com.objectEX;

	/** API
	 * -API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
	 * -자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
	 * (라이브러리라고 부르기도 한다)
	 * @param args
	 */
	
public class ObjectEx {
	public static void main(String[] args) {
		String str = "";// => Object
		// static 메서드를 가져와서 객체를 생성하지 않아도 메서드를 호출 할 수 있다
		print(str);
		System.out.println("============================");
		
		// int 타입은 기본타입이므로 Object타입으로 변환되지 못합니다.
		// int 타입을 객체형태로 변환해야합니다. ==> Wrapper 클래스인 Integer타입으로 자동형변환되어져서 들어간다
		
		int num = 0;
		
		// int -> Integer (자동형변환)
		// double -> Double
		
		// 기본타입 : 값 자체를 저장
		// 참조타입 : 주소를 저장한다 
		
		
		print(num);
		System.out.println("============================");
		ObjectEx objEx = new ObjectEx();
		print(objEx);
	

	
	}
	// 참조타입의 최상위 계층
	// 	부모타입으로 자동형변환 object 최상위부모
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의되어있지만
		// 메서드의 오버라이딩에 의해서 String클래스, Integer클래스에 정의되어 있는 메서드가 호출된다
		
		//클래스 이름@16진수주소값을 반환
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값이 같은지 비교
		// 주소가 같으면 true, 다르면 false
		System.out.println(obj.equals(obj));
		
	}
}
