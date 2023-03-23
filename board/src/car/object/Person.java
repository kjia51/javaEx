package car.object;

public class Person {

	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("기아자동차");
		System.out.println("car.company : " + car.company);
		
		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다
		car.speedUp();
		System.out.println("car.speed : " + car.speed);
		System.out.println("car1.company : " + car1.company);
	}

}
