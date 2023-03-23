package board.jungang;

public class Board3 {

		String title;
		String content;
		String writer;
		String date;
		int hitcount;
		Board3(){
			this("제목","내용","홍길동","23-03-22",10);
		}
		Board3(String title){
			this(title,"내용","홍길동","23-03-22",10);
		}
		Board3(String title, String content){
			this(title,content,"홍길동","23-03-22",10);
		}
		Board3(String title, String content, String writer){
			this(title,content,writer,"23-03-22",10);
		}
		Board3(String title, String content, String writer, String date){
			this(title,content,writer,date,10);
		}
		Board3(String title, String content,String writer,String date,int hitcount){
			this.title=title;
			this.content=content;
			this.writer=writer;
			this.date=date;
			this.hitcount=hitcount;
			
			
		}
	}

