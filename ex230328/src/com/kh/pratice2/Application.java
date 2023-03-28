package com.kh.pratice2;

import com.kh.pratice2.model.vo.Animal;
import com.kh.pratice2.model.vo.Cat;
import com.kh.pratice2.model.vo.Dog;

public class Application {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println("개");
		dog.speak();
		System.out.println("고양이");
		cat.speak();

		Animal[] animal = new Animal[5];
		
		for(int i=0;i<animal.length;i++) {
			System.out.println(i+"번째");
			if ((int)(Math.random()+0.5)==1) {
				animal[i] = new Cat();
			} else {
				animal[i] = new Dog();
			}
			animal[i].speak();
		}
	}
}
