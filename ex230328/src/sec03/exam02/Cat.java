package sec03.exam02;

public class Cat extends Animal{
	public Cat() {
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("소리를 낸다 : 야옹");
	}

}
