import java.util.Random;

public class Lab4num5{
    public static void main(String [] args){
    	
        Random rand = new Random();
        double sum = 0;
        int amount = 2;
        int upperBound = 1000;

        for (int i = 0; i < amount; i++){
            int next = rand.nextInt(upperBound) + 1;
            System.out.println(next);

            sum += next;
        }

        System.out.println("Your average is: " + (sum/amount));
    }
}
//I was confused on what this question was asking so this is what I understood out of it.