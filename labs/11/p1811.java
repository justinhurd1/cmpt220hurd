import java.util.Scanner;

public class p1811 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    long n = input.nextLong();

    System.out.println(sumDigits(n));
  }

  public static int sumDigits(long n) {
    if (n == 0) { return 0; }
    return (int)(n % 10 + sumDigits(n / 10));
  }
}