package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	public void print(Animal animal) {
		System.out.println("============");
		animal.sound();
		System.out.println(animal.kind);
	}
	
	
	public abstract void sound();
}
