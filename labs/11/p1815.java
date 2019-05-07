import java.util.Scanner;

public class p1815 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    System.out.print("Enter a character: ");
    char c = input.nextLine().charAt(0);

    System.out.println(count(s, c));
  }

  public static int count(String str, char a) {
    return count(str, a, 0);
  }

  private static int count(String str, char a, int high) {
    if (high < str.length()) {
      int match =
        str.toLowerCase().charAt(high) == Character.toLowerCase(a) ? 1 : 0;
      return match + count(str, a, high + 1);
    } else {
      return 0;
    }
  }
}