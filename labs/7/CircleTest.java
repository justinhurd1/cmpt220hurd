public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle(2, 2, 5.5);

		System.out.println("The Circle area is: " + circle.getArea()); 
		System.out.println("TheCircle perimeter is: " + circle.getPerimeter());
		
		System.out.println("Does the circle have the point (3, 3)? " + circle.contains(3, 3)); 
		
		System.out.println("Does the circle have the other centered at (4, 5) and radius 10.5? " 
			+ circle.contains(new Circle(4, 5, 10.5)));
		
		System.out.println("Does the circle overlap the other centered at (3, 5) and radius 2.3? " 
			+ circle.overlaps(new Circle(3, 5, 2.3)));
	}
}