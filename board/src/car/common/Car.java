package car.common;

public class Car{
	
		// "기본모델 블개, 10)
	String model; 
	String color; 
	int MaxSpeed;	

	
	// 생성자의 오버로딩
	// 매겨변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징
	// 반환값이 없다 클래스와 이름이 같음
	public Car() {
		// 생성자 호출
		// this. : 필드
		// this() : 생성자
		// 생성자를 사용하기 위해서 매개변수에 알맞은 파라메터를 넣어줍니다
		// 생성자에서 다른 생성자를 호출할 수 있다
		// -> 중복되는 코드를 줄이기 위해서
		this("기본모델", "블랙",150);
	}; 
	// 기본 생성자
	
	public Car(String model) {
		//this.model = model;
		//-> 코드블럭안에서는 로컬변수가 우선되므로
		this(model, null,0);
//		this(model, "블랙",150);
	}; // 생성자 오버로딩
	
//	코드블럭에서는 로컬변수가 우선되므로 아무런 의미가 없음.
	
	
	public Car(String model, String color) {
		//생성자를 호출하는 것은 첫번째 줄에서만 가능합니다.
		this(model, color, 0);
//		this.color = color;
//		this.model = model;
	}
		
	public Car(String model, String color, int MaxSpeed) {
		this.model = model;
		this.color = color;
		this.MaxSpeed = MaxSpeed;
		};
}
	

