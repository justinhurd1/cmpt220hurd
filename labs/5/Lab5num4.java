import java.util.Scanner;

public class Lab5num4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first Array: ");
		int[] x = new int[input.nextInt()];

		for (int i = 0; i < x.length; i++){
			x[i] = input.nextInt();
		}
		
		System.out.print("Enter the second Array: ");
		int[] y = new int[input.nextInt()];

		for (int i = 0; i < y.length; i++){
			y[i] = input.nextInt();
		}

			if (equal(x, y)){ // JA: They could be in different order
			
			System.out.println("Two lists are identical");
			} else {
			System.out.println("Two lists are not identical");
			}
	}

	public static boolean equal(int[] x, int[] y){
		if(x.length != y.length) 
			return false;

		for (int i = 0; i < y.length; i++){
			if (x[i] != y[i])
				return false;
		}
		return true;
	}
}