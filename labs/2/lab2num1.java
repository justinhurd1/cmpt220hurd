import java.util.Scanner;

public class lab2num1{
	public static void main(String[] args) {
		int number1;
		int number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input First Integer: ");
		number1 = input.nextInt();
		
		System.out.print("Input Second Integer: ");
		number2 = input.nextInt();
		
		if(number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if(number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if(number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if(number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if(number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);			
	}
}