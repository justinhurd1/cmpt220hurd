import java.util.Scanner;
import java.util.Random;

public class lab2num3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lower;
		int upper;
		int rand1;
		int rand2;
		int rand3;
		
		
		System.out.print("Input Lower Limit Integer: ");
		lower = input.nextInt();
		
		System.out.print("Input Higher Limit Integer: ");
		upper = input.nextInt();
		
		Random randomNumber = new Random();
		
		rand1 = randomNumber.nextInt(upper - lower) + lower + 1;	
		rand2 = randomNumber.nextInt(upper - lower) + lower + 1;
		rand3 = randomNumber.nextInt(upper - lower) + lower + 1;
		
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.print(rand3);
		
	}
}