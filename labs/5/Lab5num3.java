import java.util.Scanner;

public class Lab5num3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		System.out.println("Enter the name and a score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		sort(students, scores);

		for (String stud: students) { 
			System.out.println(stud);
		}	
	}

	public static void sort(String[] str, int[] num) {
		for (int i = 0; i < num.length; i++) {
			int max = num[i];
			int maxIndex = i;
			String temp;

			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > max) {
					max = num[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				temp = str[i];
				str[i] = str[maxIndex];
				str[maxIndex] = temp;

				num[maxIndex] = num[i];
				num[i] = max;
			}
		}
	}
}