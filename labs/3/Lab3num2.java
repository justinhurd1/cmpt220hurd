public class Lab3num2 {

	public static void main(String[] args) {
		
		int numPerline = 10;	
		int count = 0;

		for (int i = 100; i <= 500; i++) {
			if (i % 5 == 0 ^ i % 7 == 0) { // JA
				count++;
				
				if (count % numPerline == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}
	}
}
	
