package getter.setter;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	//1. private 접근제한자를 이용하여 외부에서 생성자를 이용하지 못하도록 막는다.
	private Singleton() {
		
	}
	
	//2. 외부에서 접근할 수 있는 메서드를 만들고 생성된 객체를 반환한다
	// 	- 생성을 할 수 없으므로 정적 메서드로 만들어야 한다
	//	- 정적 필드에 자신을 생성하여 리턴해준다
	
	public static Singleton getInstance() {
		// 정적 메서드에서는 정적 필드, 정적메서드만 사용이 가능하다.
		// => 프로그램 방법론
		return singleton;
	}
	public static void main(String[] args) {
		Singleton ex = singleton.getInstance();
		Singleton ex1 = singleton.getInstance();
		Singleton ex2 = singleton.getInstance();
		
		
		// 같은 주소를 가지고 있는지 확인

		if (ex==ex1) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
			
		}
	}

}
