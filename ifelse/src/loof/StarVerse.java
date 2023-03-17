package loof;

public class StarVerse {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=5;j>=6-i;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
