public class TestSquare{
	public static void main(String[] args){

		Square Square1 = new Square(40);

		System.out.println("Square One");

		System.out.printf("Width : %.2f\n", Square1.getWidth());

		System.out.printf("Area : %.2f\n", Square1.getArea());

		System.out.printf("Perimeter : %.2f\n", Square1.getPerimeter());

		Square Square2 = new Square(35.9);

		System.out.println("Square Two");

		System.out.printf("Width : %.2f\n", Square2.getWidth());

		System.out.printf("Area : %.2f\n", Square2.getArea());

		System.out.printf("Perimeter : %.2f\n", Square2.getPerimeter());

	}

}