import java.util.Scanner;

public class Lab4num8 {
    int array[] = new int[100];
    int count;
    
    public static void main(String[] args) {
        Lab4num8 obj = new Lab4num8();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an array and end with 0: ");
        
        while(true){
            int i = input.nextInt();
            
            if(i > 0){
                obj.array[obj.count] = i;
                obj.count++;
            }else if(i == 0){
                break ;
            }
        }
        obj.printarray();
    }
   
    void printarray(){
        for(int i = 0; i < count;i++){
        	for(int j = i+1;j < count; j++){
                if(array[i] > array[j]){
                    int x = array[i];
                    array[i]= array[j];
                    array[j] = x;
                }
            }
        }
        System.out.println("Printing array in sorted order");
        for(int i = 0; i < count;i++){
            System.out.print(array[i] + " ");   
        }
     }
}
