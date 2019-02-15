import java.util.Random;

public class lab2num6 {
  public static void main (String[] args) {
	  
	  int number1, number2, number3;
	  
	  Random rand = new Random();
	
	number1 = rand.nextInt (900) + 100;
    number2 = rand.nextInt (900) + 100;
    number3 = rand.nextInt (9000) + 1000;

    System.out.println(number1+"-"+number2+"-"+number3);
  }
}