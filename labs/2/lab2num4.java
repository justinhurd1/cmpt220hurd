import java.util.Scanner;

// JA: This was an exercise with the char type
public class lab2num4{
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input First Integer: ");
		number1 = input.nextInt();
		
		System.out.print("Input Second Integer: ");
		number2 = input.nextInt();
		
		int sum = number1 + number2;
		
		System.out.println("The sum is: " + sum);
	}
}