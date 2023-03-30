package ex;

public class Library {
	
	//책 리스트
	private Book[] bookArr = new Book[5];
	
	
	/**
	 * 책 리스트 추가
	 */
	
	public void addBook(){
		bookArr[0] = new Book("제목1","작성자1");
		bookArr[1] = new Book("제목2","작성자2");
		bookArr[2] = new Book("제목3","작성자3");
		bookArr[3] = new Book("제목4","작성자4");
		bookArr[4] = new Book("제목5","작성자5");
	}
	
	@Override
	public String toString() {
		String str ="";
		for(Book b : bookArr) {
			str += b.getTitle()+" "+b.getWriter()+"\n";
		}
		
		
		return str;
	}
}
