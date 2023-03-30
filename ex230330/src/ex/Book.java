package ex;

//DAO DATA ACCESS OBJECT
//VO VALUE OBJECT

//데이터를 담는 그릇
//책의 정보를 담고 있어요
public class Book extends Library{
	private String title;
	private String writer;
	
	public Book() {
		
	}
	
	public Book(String title, String writer) {
		this.title=title;
		this.writer=writer;
	}
	


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}
	

}
