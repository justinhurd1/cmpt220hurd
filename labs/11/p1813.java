import java.util.Scanner;

public class p1813 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 8 integers: ");
    int[] arr = new int[8];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }

    System.out.println(largest(arr));
  }

  public static int largest(int[] arr) {
    return largest(arr, 0);
  }

  public static int largest(int[] arr, int index) {
    if (index == arr.length - 1) { return arr[index]; }
    return Math.max(arr[index], largest(arr, index + 1));
  }
}