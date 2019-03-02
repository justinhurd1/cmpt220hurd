import java.util.Scanner;

public class Lab4num4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        String string = ""; 

        for(int i = 0;i < str.length(); i++){
        	char ch = str.charAt(i);  

            for(int j = i;j < str.length(); j++){

                char char2 = str.charAt(j);  

                if(ch == char2 && string.indexOf(ch) == -1){
                	count = count+1;
                }
            }

             if(string.indexOf(ch) == -1){
            	string = string + ch;
            	
            System.out.println(ch + "   occurs   " + count + "    times");
             }   
              count=0;
        }
    }
}