package sec03.exam02;

public class Application {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		Dog dog = new Dog();
		dog.sound();
		
		cat.print(cat);
	}
}
