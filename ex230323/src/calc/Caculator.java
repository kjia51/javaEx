package calc;

public class Caculator {
	
	// true : 켜짐, false : 꺼짐
	boolean powerOn; // 초기값 : 꺼짐
	
	/**
	 * 전원을 키거나 끕니다
	 */
	public void powerON(){
		if (!powerOn) {
			powerOn = false;
			System.out.println("계산기가 꺼졌습니다");
		} else {
			powerOn = true;
			System.out.println("계산기가 켜졌습니다");
		}
	}
	
	public int add(int num1, int num2) {
		if(powerOn) {
			return num1+num2; 
		} else {
			System.out.println("계산기를 켜주세요");
			return 0;
		}
	}
	public int add(int[] numbers) {
		int sum=0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}
	
	//배열로 들어온다
	//int 타입이 여러개 입력 => 배열로 받아서 사용
	public int addFn(int ... numbers) {
		int sum=0;
		for(int num : numbers) {
			sum+=num;
		}
		return sum;
	}
	public static void main(String[] args) {
		Caculator calc = new Caculator();
		calc.powerON();
		
		// 매개변수의 타입과 갯수가 일치하지 않을 때
		// 이름이 다를 경우
		int res = calc.add(5, 2);
		System.out.println(res);
		
		// 배열을 생성 후 메서드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers) : "+calc.add(numbers));
		
		System.out.println("calc.add(new int[] {1,2,3,4,5} : "
				+calc.add(new int[] {1,2,3,4,5}));
		
		System.out.println("calc.addFn(1,2,3,4,5,6) : "+calc.addFn(1,2,3,4,5,6));
	}
	
}
