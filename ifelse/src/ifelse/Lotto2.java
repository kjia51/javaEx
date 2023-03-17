package ifelse;

public class Lotto2 {
	public static void main(String[] args) {
		// 1부터 45개까지의 수중에서
		// 무작위로 5개의 숫자를 출력
		// 카운트 : 숫자를 출력할때마다 1씩 증가
		int i = 0;
		System.out.print("====로또 번호====\n");
		while(true) {			
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+" ");
			i++;
			if(i==5) {
				break;
			}
		}
		System.out.print("\n=======끝=======");
	}

}