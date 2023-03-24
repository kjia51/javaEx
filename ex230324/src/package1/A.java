package package1;

import package2.C;

public class A {
	// 필드 정의
//	C c = new C();
	
	// 코드 작성 불가
	// System.out.println("");
	
	// 기능 정의
	public void method1() {
		C c = new C(1);
		B b = new B();
		c.method1();
		
	}
	
}
//접근제한자는 1개의 클래스에만 붙임
class B {
	//default일 경우 같은 패키지에서 호출 가능
	B() {
		
	}
	
}