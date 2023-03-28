package sec02.exam04;

// Vehicle을 상속받아서 구현된 객체가 매개변수로 입력된 경우
// 부모타입으로 자동 형변환 된 경우

// 만약 vehicle의 원래 타입이 Bus가 맞다면
// 생성된 인스턴스(객체) instance of (타입)
// 나의 원래 생성 타입
public class Driver {
	void drive(Vehicle vehicle) {
		Vehicle v = new Bus();
		Vehicle v1 = new Vehicle();
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			System.out.println("Bus타입으로 변환 성공");
	} else {
		System.out.println("Bus타입으로 변환 불가");
	}
		vehicle.run();
}
}