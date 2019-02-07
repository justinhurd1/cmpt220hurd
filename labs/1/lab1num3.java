import java.util.Scanner;

public class lab1num3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in ounces: ");
		double ounces = input.nextDouble();
		
		double grams = (ounces * 28.3495);
		System.out.println(" Ounces " + ounces + " is " + grams + " in grams");
	}
}