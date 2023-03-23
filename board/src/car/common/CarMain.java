package car.common;

public class CarMain {
	public static void main(String[] args) {
		
		//메서드 또는 생성자의 위치로 이동하는 방법
		// f3 또는 ctrl + 클릭
		Car[] carlist = new Car[3];
		carlist[0] = new Car("그랜져");	
		carlist[1] = new Car("SM5","빨강");
		carlist[2] = new Car("그랜져", "블랙", 0);
		for (Car car : carlist) {
			System.out.println(car.color);
		}
		
	}
}
