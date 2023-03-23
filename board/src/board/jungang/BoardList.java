package board.jungang;

public class BoardList {
	// 배열이 필드로 선언
	// 필드에는 여러가지 타입이 올 수 있다
	// 객체들이 여러가지 관계를 가질 수 없음
	// 의존적이다...(?)
	Board[] boardList;
	public BoardList(Board[] boardList){
		this.boardList = boardList;
	}
}
