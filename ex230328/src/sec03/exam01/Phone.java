package sec03.exam01;

// 추상메서드를 하나라도 포함하고 있으면 추상 클래스가 된다
// 추상메서드가 없어도 abstract키워드를 선언함으로써 추상클래스가 될 수 있다
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner; 
	}
	
	public abstract void turnOn();
		
	// 하위클래스에게 작성을 강제한다
	// 미완성된 메서드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOff();
}
