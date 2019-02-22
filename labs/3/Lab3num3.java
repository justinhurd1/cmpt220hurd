public class Lab3num3{
    public static void main(String[] args){
    	
    	int numPerline = 20;
    	int counter = 0;

        for(int i=1; i<=100; i++){
				counter++;
        	if (counter % numPerline == 0)
        		System.out.println((char)i);
        	else
        		System.out.print((char)i + " ");
        	
        	}
        
    }
}