import java.util.Scanner;

public class lab1num4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0;
		int c = 299972458;
		int E = 0;
		
		System.out.print("Enter mass in Kg to get Energy: ");
		m = input.nextInt();
		
		E = m * (c^2);
		
		System.out.println();
		System.out.println("Energy = " + E);
	}
}