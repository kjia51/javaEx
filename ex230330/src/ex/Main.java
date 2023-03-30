package ex;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		Book book = new Book();
		
		lib.addBook();
		System.out.println(lib.toString());
		System.out.println(book.toString());
}
}
