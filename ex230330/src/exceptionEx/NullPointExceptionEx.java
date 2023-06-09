package exceptionEx;

public class NullPointExceptionEx {
	public static void main(String[] args) {
		String str = null;
		
		// 참조변수가 null 값을 가지고 있을 대
		// 참조변수로부터 객체접근연산자(.)를 이용해서 접근할때 발생하는 오류
		try {
			str.toString();
			
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		
//		print(str);
		// 프로그램이 정상적으로 종료될 수 있도록 처리해줍니다.
		System.out.println("프로그램이 정삭적으로 종료되었습니다.");
	}
	
	public static void print(String str) throws Exception{
//		System.out.println(str.toString());
		throw new Exception("강제오류 발생");
	}
}
