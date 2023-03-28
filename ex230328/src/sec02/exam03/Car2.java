package sec02.exam03;

	public class Car2 {
		// 초기값 null
		private Tire FLtire;
		private Tire FRtire;
		private Tire BLtire;
		private Tire BRtire;
		public Car2(Tire tire1,
				Tire tire2,
				Tire tire3,
				Tire tire4){
			
			FLtire = tire1;
			FRtire = tire2;
			BLtire = tire3;
			BRtire = tire4;
			
		}
		
		/**
		 * 바퀴를 굴려줍니다
		 * @return
		 */
		public int run() {
			System.out.println("굴러갑니다");
//			boolean next = FLtire.roll();
//			if(!next) {
//				System.out.println(FLtire.roll()+"타이어 교체");
//				// 다형성에 의해 
//				// 자식객체는 부모의 타입으로 자동 형변환 된다!
//				FLtire = new KumhoTire(null,3);
//			}
			
			if(!FLtire.roll()) {
				System.out.println(FLtire.location+"교체");
				return 1;
			}
			if(!BLtire.roll()) {
				System.out.println(BLtire.location+"교체");
				return 2;
			}
			if(!FRtire.roll()) {
				System.out.println(FRtire.location+"교체");
				return 3;
			}
			if(!BRtire.roll()) {
				System.out.println(BRtire.location+"교체");
				return 4;
			}
			return 0;
			
			

		
		}
		
		/**
		 * 바퀴의 위치를 매개변수로 받아서
		 * 해당위치의 바퀴를 교체하는 메서드
		 * @param location
		 */
		public void changeTire(int num) {
			switch (num) {
			case 1:
				FLtire = new KumhoTire("FL",5);
				break;
			case 2:
				BLtire = new KumhoTire("BL",5);
				break;
			case 3:
				FRtire = new KumhoTire("FR",5);
				break;
			case 4:
				BRtire = new KumhoTire("BR",5);
				break;
				
			default:
				
				break;
				
			}
		}
}
