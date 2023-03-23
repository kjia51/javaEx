package ex230323;

public class Person {
	protected String name;
	int age;
	double height;
	double weight;
	Person(){
//		this(null, 0, 0, 0);
		this("lee", 50, 180, 70);
	}
	Person(String name, int age, double height, double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name + "," + age;
	}
	public static void main(String[] args) {
		Person person = new Person();
		Person hong = new Person("홍길동", 12, 170, 60);

		Person[] personArr = new Person[5];
		personArr[0]=new Person("김지민",20,0,0);
		personArr[1]=new Person("한가인",30,0,0);
		personArr[2]=new Person("김종국",10,0,0);
		personArr[3]=new Person("김종민",50,0,0);
		personArr[4]=new Person("서태지",60,0,0);
		
		
		System.out.println(hong.age);
		System.out.println(person.age);
		
//		for(Person person1 :personArr) {
//			
//			System.out.println(person1.information());
//			System.out.println(person1.age);
//		}
	}
		
	}

