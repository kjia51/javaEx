package loof;

public class Ex04_06 {

	public static void main(String[] args) {
		System.out.println("============");
		// i = 1,2,3,4
		for(int i=1; i<5; i++){
			// j = 4,3,2,1
			for(int j=4;j>0;j--){
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
	}
		System.out.println("============");

}
}