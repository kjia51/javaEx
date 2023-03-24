package getter.setter;

import java.util.Calendar;

public class Person {
	
		static final double PI = 3.14159;
		static final double EARTH_RADIUS = 6400;
		
		// 상수 : 한번 값이 정해지고 나면 수정이 불가능
		final String nation = "korea";
		final String ssn;
		String name;
		
		public Person(String ssn, String name) {
			this.ssn=ssn;
			this.name=name;
			// 싱스값일 변경하는 것이 불가능!
//			tish.ssn = "12345-7891011" 
			 this.name="정찬우";
	}
		public static void main(String[] args) {
			Person P = new Person ("12345","hong");
			//상수 필드의 값을 변경할 수 없다
//			p.nation="한국"; --> 오류 발생
			P.name="홍사원";
			
			System.out.println("파이값 : "+ Person.PI);
			System.out.println("지구반지름 : "+ Person.EARTH_RADIUS+"km");
			
			Calendar cal = Calendar.getInstance();
			int day = cal.get(Calendar.DATE);
			int day1 = cal.get(Calendar.DATE);
			System.out.println(day);
			System.out.println(day1);
			
			System.out.println(cal.get(Calendar.YEAR)+"년");
			System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
			System.out.println(cal.get(Calendar.MINUTE)+"분");
			System.out.println(cal.get(Calendar.SECOND)+"초");
			System.out.println(cal.get(Calendar.DATE)+"일");
			
			// 실행전 
			long before = System.currentTimeMillis();
			System.out.println(before);
			long after = System.currentTimeMillis();
			System.out.println(after);
			
			
			
			
			
			
			
			
			
			
		}
}
