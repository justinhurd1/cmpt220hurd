import java.util.*;
import java.util.Scanner;

public class Lab5num6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array: ");
		
	}
	public static double averageRow(double array[][], int column) {

		double sum = 0;
		int count = 0;
	for (int i = 0; i < array[column].length; i++)
		for (int col = 0; col < array[0].length; col++) {
			sum += array[i][col];
			count++;
		}
	return sum/count;
	}
	
}
//I was confused on this because its asking for averageRow but wants us to find the average of column