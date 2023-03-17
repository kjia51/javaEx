package ifelse;

public class Lottery {

	public static void main(String[] args) {
		int i = 0;
		System.out.printf("====로또번호====\n");
		while(true) {
			int num = (int)(Math.random()*45)+1;
			System.out.printf(num+" ");
			
			if (i==6) {
				break;
			}
			i++;
		}
		System.out.printf("\n====출력 끝====");
		
	}

}
