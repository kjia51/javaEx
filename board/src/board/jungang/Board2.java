package board.jungang;

public class Board2 {
		//제목
		String title;
		String content;
		String writer;
		String date;
		int hitcount;
	
	Board2(String title, String content){
		// 생성자 : 필드 초기화
		// 중복제거하기 위해 다른 생성자를 호출
		this(title, content, "로그인한 회원아이디","현재 컴퓨터 날짜",0);
		this.title=title;
		this.content=content;
		this.writer="로그인한 회원아이디";
		this.date="현재컴퓨터날짜";
		this.hitcount=0;
	} 
	Board2(String title, String content, String writer){
		this(title, content, writer,"현재 컴퓨터 날짜",0);
	} 
	Board2(String title, String content, String writer, String date){
		this(title, content, writer,date,0);
	} 
	Board2(String title, String content, String writer, String date, int hitcount){
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;
//		this(title, content, "로그인한 회원아이디","현재 컴퓨터 날짜",0);
		
		
	} 
}
