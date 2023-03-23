package calc;

public class Car {
	int gas;
	
	// 생성자 gas 초기화
	public Car(int gas) {
		this.gas = gas;
	}
	
	// 달립니다 출력
	public void run1() {
		System.out.println("달립니다");
		// 내부 메서드를 호출합니다.
		stop();
		// 이름, 매개변수의 개수, 타입이 일치하는 메서드를 찾아서 실행합니다
		sound("빵");
	}
	public void stop() {
		System.out.println("멈춥니다");
	}
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	
	// 반환타입이 boolean일 경우 메서드명에 is가 주로 붙음.
	// 기름이 0이면 false를 반환
	
	public boolean isLeftGas() {
		if (gas>0) {
			return true;
		} else {
			return false;			
		}
	}
	
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas-=1;
				System.out.println("달립니다");
				System.out.println("남은 기름양 : " + gas);
				
//				if(gas==0) {
//					return;
//				}
			} else {
				System.out.println("기름이 떨어졌어요");
				System.out.println("남은 기름양 : " + gas);
				//break; 반복문을 탈출
				// 메서드를 강제 종료
				return;
			}
			
		}
	}
	public static void main(String[] args) {
		Car car = new Car(10);
		car.run1();
		car.sound("빵");
		
//		car.run();
//		if(car.isLeftGas()) {
//			System.out.println("남은 기름 양 : " + car.gas);
//			} else 
//		System.out.println("주유 해주세요");
//	}
	}
}
