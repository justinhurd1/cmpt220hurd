import java.util.Random;

public class Lab4num2{
	public static void main(String[] args) {
		char chars[][] = new char[5][5]; 
		Random random = new Random(); 
		
		for(int i = 0;i < 5; i++){
			for(int j = 0; j < 5; j++){
				char c = (char)(random.nextInt(26) + 'a'); 
				chars[i][j] = c; 
				System.out.print(chars[i][j] + " "); 
			}
			System.out.print("\n");
		}
  
	}
}