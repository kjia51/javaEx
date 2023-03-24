package speed;




public class Car {
	// 필드 : 속성을 정의
	int speed;
	
	// 생성자 : new연산자에 의해 객체를 생성할때 호출
	// 1. 기본생성자
	public Car(){
	
	}
	
	// 2. speed를 매개변수로 받는 생성자
	public Car(int speed){
		this.speed=speed;
	}
	

	// 메서드 : 기능을 정의
	// getSpeed() : int X
	// keyTurnOnOP() : void
	// run():void
	
	public int getSpeed() {
		return speed;
	}
	public void keyTurnOnOP() {
		System.out.println("시동을 켭니다");
	}
	// 속도를 1씩 증가시키면서 50까지 출력
	public void run() {
		for(int i=0; i<=50;i+=10) {
			System.out.println("i="+i);
			//필드에 값을 설정
			speed = i;
			System.out.println("시속:"+speed+"km/h");

	
	
	}}
	
	public static void main(String[] args){
	Car car = new Car();
	car.keyTurnOnOP();
	car.run();
	int speed = car.getSpeed();
	System.out.println("현재속도 : "+ speed + "km/h");
	}

	}

