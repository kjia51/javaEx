package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
		Board3[] boardList = new Board3[3];
		boardList[0] = new Board3("제목1","내용1");
		boardList[1] = new Board3("제목2","내용2");
		boardList[2] = new Board3("제목3","내용3");
		
		for (Board3 board: boardList) {
			System.out.println("==========");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
		}
	}

}
