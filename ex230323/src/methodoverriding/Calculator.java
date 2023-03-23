package methodoverriding;

public class Calculator {
	/**
	 * 정사각형 넓이 구하기
	 * @param width
	 * @return width*width
	 */
	public double areaRectangle(double width) {
		return width*width;
	}
	
	/**
	 * 직사각형 넓이 구하기
	 * @param width
	 * @return width*heigth
	 */
	public double areaRectangle(double width, double height) {
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		double rectangle = calc.areaRectangle(4);
		System.out.println("정사각형의 넓이 ="+rectangle);
//		double rectangle = calc.areaRectangle(5, 6)
		System.out.println("직사각형의 넓이 ="
					+calc.areaRectangle(5, 6));
	}
}
