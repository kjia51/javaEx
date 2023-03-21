package arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		// 배열의 길이를 변경할 수 없으므로
		// 배열이 길이를 늘이거나 줄이기 위해서는
		// 새로운 배열을 만들고 기존 배열을 복사한다
		// int타입 배열을 선언 
		//값 {1,2,3}
		int[] oldarr= {1,2,3};
		int[] newarr = new int[5];
//		int[] newarr = {0, 0, 0, 0, 0};
		
		for(int i=0;i<oldarr.length;i++) {
			newarr[i]=oldarr[i];
		}
		for(int i=0;i<newarr.length;i++) {
//			newarr[i]=oldarr[i];
			System.out.println(newarr[i]);
		}
//		
		
	}

}
