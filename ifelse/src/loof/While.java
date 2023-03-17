package loof;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, sum=0;
		// while ( a++<=100) 1-101
		// while (a<100) 0-99 -> i++;//1-100
		
		while(++a<=100) {
			sum += a;
//			a++;
		}
		System.out.println("sum의 합:"+sum);
	}
	

}
