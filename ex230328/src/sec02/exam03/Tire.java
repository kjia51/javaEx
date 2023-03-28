package sec02.exam03;

public class Tire {
	
	// 최대 회전수
	public int maxrotation;
	// 누적 회전수
	public int rotation;
	// 타이어의 위치
	public String location;
	
	public Tire( ) {
		
	}
	
	public Tire(String location, int maxrotation) {
		// 필드 초기화
		
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 생성되지 않습니다.
		
		
		this.location=location;
		this.maxrotation=maxrotation;
	}
	
	/**
	 * 타이어 1회전 - 1번 실행할때마다 누적 회전수를 증가시킵니다
	 * 만약 maxrotation(최대 회전수보다 크면 false를 리턴합니다.)
	 * @return
	 */
	public boolean roll() {
		rotation ++;
		System.out.println(location + "누적회전수 :"+rotation);
		System.out.println(location + "최대회전수 :"+maxrotation);

		if(rotation>=maxrotation) {
			return false;
		} 
		return true;
	}
	

}
