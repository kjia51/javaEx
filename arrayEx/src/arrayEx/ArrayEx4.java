package arrayEx;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 스트링 타입의 배열 5칸을 만들기
		// 첫번째 칸에 이름 입력하기
		String[] names = new String[5];
		names[0] = "홍길동";
		
		System.out.println("names 배열의 메모리 주소");
		System.out.println(names);

				
		//자바에서 참조형 변수의 메모리 주소를 표시하는 방법
		System.out.println("names객체의 hashCode :"
		+names.hashCode());
		
		System.out.println("16진수로 변환 : "
				+Integer.toHexString(names.hashCode()));
		// 괄호 여부 있으면 메서드 없으면 필드
	}

}
