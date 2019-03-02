import java.util.Scanner;

public class MyString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") +
			"a palindrome.");
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num) ? true : false;
	}

	public static int reverse(int num) {
		String reverse = ""; 	
		String n = num + ""; 
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}