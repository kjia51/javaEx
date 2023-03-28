package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("소리를 낸다 : 멍멍");
	}

}
