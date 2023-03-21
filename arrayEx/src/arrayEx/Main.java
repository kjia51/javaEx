package arrayEx;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
        int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		for(int i=0; i<T; i++){
            System.out.print(A+B);
        }
		
	}
}
