import java.util.Scanner;

public class p1817 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a line of characters: ");
    String s = input.nextLine();
    char[] chars = s.replaceAll(" ", "").toCharArray();
    System.out.print("Enter a character: ");
    char ch = input.nextLine().charAt(0);

    System.out.println(count(chars, ch));
  }

  public static int count(char[] chars, char ch) {
    return count(chars, ch, 0);
  }

  public static int count(char[] chars, char ch, int high) {
    if (high == chars.length) { return 0; }
    int match =
      Character.toLowerCase(chars[high]) == Character.toLowerCase(ch) ? 1 : 0;
    return match + count(chars, ch, high + 1);
  }
}
