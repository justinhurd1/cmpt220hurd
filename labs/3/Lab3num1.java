import java.util.Scanner; 

public class Lab3num1{ 
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

	    int i=0;
	    int num=0;
	    double average= 0.0;
	    int sum=0;
	    int counter= 0;
	   
	    System.out.println("Enter Positive Integers then a Zero: ");
	    num=input.nextInt();
	    
	        for (i =num; i !=0; i=i){
	             if (i % 2 == 0) {
	            	 counter++;
	             }
	        sum = sum + i;
	        average = sum/counter;
	        counter = counter;
	        i = input.nextInt();
	        
	        }	
	        System.out.println("The Sum of the Integers: " + sum); 
	        System.out.println("The average is: " + average);
	        System.out.println("The amount of even numbers are:" + counter);
	}
}