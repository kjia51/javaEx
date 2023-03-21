package arrayEx;

//접근제어자 class 클래스명{}
public class ArrayEx05 {
	// 정적 프로그램 실행하면 메모리에 올려주는 -> new연산자가 필요없음
	// 접근제어자 반환타입 메서드 이름(매개변수){} : 메서드를 작성하는 법
	// void : 반환 타입이 없다는 의미
	// int, String,
	// main 메서드 이름
	// 매개변수 (타입 변수명)
	// 매개변수는 있을수도 있고 없을수도 있음
	// 매개변수가 있다면 타입을 명시해줘야함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);

		// 1:로컬 2:테스트, 3:운영
		int mode = Integer.parseInt(args[0]);
		if (mode==1) {
			System.out.println("로컬 환경입니다.");
		} // 로컬 DB 접속
		
		else if (mode==2) {
			System.out.println("테스트 환경입니다.");
		} 
		else if(mode==3){
			System.out.println("운영 환경입니다.");
		}
		
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
			
//		}
		
	}

}
