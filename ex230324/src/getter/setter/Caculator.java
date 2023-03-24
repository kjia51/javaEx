package getter.setter;

public class Caculator {
	//	필드선언
	static double pi = 3.14159;
	//	메서드선언
	//  프로그램 시작과 동시에 사용 가능한
	//  반환타입 
	public static int plus(int i, int j ) {
		return i+j;
	}
	public static int minus(int i, int j ) {
		return i-j;
	}
	public static void main(String[] args) {
		// 정적 필드, 정적 메서드는 생성하지 않고
		// 클래스 이름으로 접근하여 사용합니다.
		
		System.out.println(10*10*Caculator.pi);
		System.out.println(Caculator.plus(10, 10));
		System.out.println(Caculator.minus(10, 10));
	}
}
