package arrayEx;

public class ArrayEx13 {
	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		//  향상된 for 문 사용
		int sum=0;
		int m = 0;
		for(int score:scores) {
			sum += score;
			m = sum/scores.length;
		} 
		System.out.println(sum);
		System.out.println(m);
	}
}
