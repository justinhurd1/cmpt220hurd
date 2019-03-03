import java.util.Scanner;

public class Lab4num7{
	 public static void main (String[] args)  { 
		 Scanner input = new Scanner(System.in); // JA: Where are you reading the numbers?
		 	int array[] = new int[100];
	     	int n = array.length; 
	     	
	     	n = duplicates(array, n); 
	     	
	     	for (int i = 0; i < n; i++) 
	     		System.out.print(array[i]+" "); 
	    } 
	
		public static int duplicates(int array[], int n) {
		    	if (n == 0 || n == 1) 
		        return n; 
		       
		        int[] temp = new int[n];  
		        int j = 0; 
		        
		        for (int i = 0; i < n - 1; i++) 
		         
		            if (array[i] != array[i+1]) 
		                temp[j++] = array[i]; 
		          
		        temp[j++] = array[n-1];     
		        for (int i = 0; i < j; i++) 
		            array[i] = temp[i]; 
		       
		        return j; 
		} 
} 