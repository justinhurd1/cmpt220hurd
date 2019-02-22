import java.util.Scanner;
public class Lab3num7 {
	
	public static void main(String[] args) {
		
   		int count = 1;
   		
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d", pentNum(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
	public static int pentNum(int i) {
		return (i * (3 * i - 1))/2;
	}
}