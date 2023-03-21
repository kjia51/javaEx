package arrayEx;

public class ArrayEx06 {
	public static void main(String[] args) {
		// 2차원 배열
		// 마치 행열과 같이 선언
		int[][] scores = new int[2][3];
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		System.out.println("scores.length : "+ scores.length);
		System.out.println("scores.length[0] : "+scores[0].length);
		System.out.println("scores.length[1] : "+scores[1].length);
		System.out.println("scores.length[0][1] : "+scores[0][1]);
		// 변수이름[몇열][몇행] 
		
		// 행을 가지고 오는 방법
		// 변수명 [행번호]
		scores[0]=new int[]{1,2,3};
		scores[1]=new int[]{4,5,6};
		
		for (int i=0;i<scores.length;i++) {
			int[] points = scores[i];
			for (int j=0; j<points.length;j++) {
				System.out.println(scores[i][j]);
			}
		}
	}
}
