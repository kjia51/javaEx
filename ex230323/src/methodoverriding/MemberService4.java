package methodoverriding;

import java.util.Scanner;

public class MemberService4 {
	// 필드
	public String id;
	public String pw;
	// 메서드
	/**
	 * 로그인 처리
	 * 필드에 등록된 id와 pw가 일치하면 true
	 * 일치하지 않으면 false를 반환
	 * @param id
	 * @param pw
	 * @return 로그인성공 : true, 로그인 실패 : false
	 */
	public MemberService4(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		if (id!=null 
				&& id.equals(this.id)
				&& pw != null
				&& pw.equals(this.pw)) {
			
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	public void logout() {
		//동일한 이름의 지역변수가 없으니깐...
		//id는 필드를 의미합니다.
		System.out.println(id+"님 로그아웃 되었습니다.");
	}
	public static void main(String[] args) {
		MemberService4 service = new MemberService4("홍길동", "12345");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(true) {
			
		System.out.print("id : ");
		String id = scan.next();
		System.out.print("password : ");
		String pw = scan.next();
		
		boolean res = service.login(id, pw);
		if(res) {
			System.out.println("환영합니다~!");
			break;
		} else {
		System.out.println("아이디와 패스워드가 일치하지 않습니다");
		i++;
			if (i>=5) {
				System.out.println("비밀번호 5회 이상 틀렸습니다.");
				System.exit(0);
		}
	}
		System.out.println("로그아웃을 하시려면 q를 입력해주세요");
		String exit = scan.next();
		if("q".equals(exit)) {
			System.exit(0);
			
		}
}
}
}