import java.util.Scanner;

public class lab2num5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first fruit: ");
		String fruit1 = input.nextLine();
		System.out.print("Enter the second fruit: ");
		String fruit2 = input.nextLine();
		
		if(fruit1.compareTo(fruit2) < 0)
			System.out.println("The fruits in alphabetical order are " +
				fruit1 + " then " + fruit2);
		else
			System.out.println("The fruits in alphabetical order are " + fruit2 + " then " + fruit1);
		
	}
}