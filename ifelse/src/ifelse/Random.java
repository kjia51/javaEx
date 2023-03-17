package ifelse;

public class Random {

	public static void main(String[] args) {
		
		// 0.0 ~ 1.0 사이의 무작위 수를 추출하여 double 타입으로 반환
		// 0.00000000.....1 - 0.99999...9
		// 10을 곱했을 때 : 0-9
		// 100을 곱했을 때 : 00-99 

		
		double lotto1 = Math.random();
		double lotto2 = Math.random();
		double lotto3 = Math.random();
		double lotto4 = Math.random();
		double lotto5 = Math.random();
		
		System.out.println(lotto1);
		System.out.println(lotto2);
		System.out.println(lotto3);
		System.out.println(lotto4);
		System.out.println(lotto5);
		
		int num = (int)(Math.random()*6)+1;
		if (num==1) {
			System.out.println("숫자1 출력");
		} else if (num==2) {
			System.out.println("숫자2 출력");
		} else if (num==3) {
			System.out.println("숫자3 출력");
		} else if (num==4) {
			System.out.println("숫자4 출력");
		} else if (num==5) {
			System.out.println("숫자5 출력");
		} else  {
			System.out.println("숫자6 출력");
		}
		
		switch (num) {
		case 1:
			System.out.println("1출력");
			break;
		case 2:
			System.out.println("2출력");
			break;
		case 3:
			System.out.println("3출력");
			break;
		case 4:
			System.out.println("4출력");
			break;
		case 5:
			System.out.println("5출력");
			break;
		case 6:
			System.out.println("6출력");
			break;
		default:
			System.out.println("======종료======");
//			break;
		}
		
		
		
		
		
	}

}
