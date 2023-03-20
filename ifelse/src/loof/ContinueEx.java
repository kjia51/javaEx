package loof;

public class ContinueEx {
	public static void main(String[] args) {
		System.out.println("짝수 합 구하기");
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if (i%2==1) {
				continue;
			}
			sum += i;
			}
		System.out.println("sum="+sum);
	}
}
