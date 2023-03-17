package ifelse;

public class Lotto {

	public static void main(String[] args) {
		int i = 0;
		System.out.print("======로또 번호=======\n");
		while(i<6) {			
			int num = (int)(Math.random()*45)+1;
			
			System.out.print(num+" ");
			i++;
		}
		System.out.print("\n=========끝=========");
	}

}
