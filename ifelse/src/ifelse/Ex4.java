package ifelse;

public class Ex4 {

	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A' : System.out.println("VVIP");
		case 'B' : System.out.println("VIP");break;
		case 'C' : System.out.println("우수회원");
		case 'D' : System.out.println("일반회원");break;
		default: System.out.println("혜택x");
		}
	}

}
