package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열을 생성
		// 반복문을 이용해서 비열에 입력된 값을 출력
		
		String[] name = {"홍길동","임꺽정","이몽룡","춘향이"};
//			System.out.println(name[1]);
			
			for (int i=0; i<name.length; i++) {
				// 배열의 값에 접근 : 변수이름[방번호]
				System.out.println(name[i]);
			}
	}

}
