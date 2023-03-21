package arrayEx;

public class ArrayEx12 {
	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		//  향상된 for 문 사용
		int sum=0;
		for(int s : scores) {
				sum+= s;
				
			}
		System.out.println("점수의 총합 : "+sum);
		System.out.println("평균 점수 :" +sum/scores.length);
				
			
		}
}
