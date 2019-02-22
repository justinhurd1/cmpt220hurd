import java.util.Scanner;

public class Lab3num6 {
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String word = input.nextLine();
 
        System.out.print("The amount of vowels in the string: " + vowelCount(word)+"\n");
    }
  
  	public static int vowelCount(String word){
        int count = 0;
        
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
