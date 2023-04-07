package connection;

import java.util.Date;

public class Book {
	// value object
	int no;
	String title;
	String author;
	String isRent;
	Date regdate;
	Date editdate;
	
	
	public Book(int no, String title, String author, String isRent, Date regdate, Date editdate) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.regdate = regdate;
		this.editdate = editdate;
		
	}
	
	@Override
	public String toString() {
		
		return getNo()
				+" "+getTitle()
				+" "+getAuthor()
				+" "+getIsRent()
				+" "+getRegdate()
				+" "+getEditdate();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsRent() {
		return isRent;
	}
	public void setIsRent(String isRent) {
		this.isRent = isRent;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getEditdate() {
		return editdate;
	}
	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}
	
	
}
