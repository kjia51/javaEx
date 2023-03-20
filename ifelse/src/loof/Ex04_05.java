package loof;

public class Ex04_05 {
	public static void main(String[] args) {
// *  
// **
// ***
// ****
		System.out.println("============");
		for(int i=1; i<5; i++){
			
			for(int j=4;j>0;j--){
				if(j-i<i) {
					System.out.println("*");
				} else {
					System.out.println(" ");
					
				}
			
				System.out.println();
			}
			// 줄바꿈
		
		}
		System.out.println("============");
	}
}
