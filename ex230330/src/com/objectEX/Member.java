package com.objectEX;

public class Member {
	public static void main(String[] args) {
		Member member1 = new Member("id");
		Member member2 = new Member("id");
		// equals 두 객체를 비교합니다
		System.out.println("member1.equals(member2)"+member1.equals(member2));
		System.out.println(member1.equals(member2));
	}
	private String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	/**
	 * this(Member)객체가 가지고 있는 id값과
	 * 매개변수로 받은 Object의 id값이 일치하는지 비교
	 * 
	 * 
	 */
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		System.out.println("obj.equals:"+super.equals(obj));
		System.out.println("member.equals:"+getId().equals(member.id));
		System.out.println();
		
		if (getId().equals(member.id)) {
			System.out.println("obj.equals:"+super.equals(obj));
			return true;
		} else {
			return false;
		}
		
//		if(obj instanceof Member ) {
//			
//		}
//		if (this.id == ((Member)obj).getId()) {
//			
//		}
		// 객체가 가지고 있는 id값이 같다면 true아니면 false;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
