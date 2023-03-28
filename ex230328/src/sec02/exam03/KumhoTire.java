package sec02.exam03;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxrotation) {
		super(location, maxrotation+2);
		
	}
	@Override
	public boolean roll() {
		rotation ++;
		System.out.println("******금호"+location + "누적회전수 :"+rotation);
		System.out.println("******금호"+location + "최대회전수 :"+maxrotation);

		if(rotation>=maxrotation) {
			return false;
		} 
		return true;
	}
}
