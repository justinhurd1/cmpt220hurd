import java.util.Scanner;

public class Lab3num4 {
    public static void main(String[] args){
        int n = 15000;
        while(prim(n) == false){
            n--;
        }                                     
        System.out.println(n + " is the biggest prime number within 15000.");                    

    }


    public static boolean prim(int m){
        int p=m;
        for(int i=2;i<p;i++){
            if(p%i == 0){
                return false;
            }

        }   
        return true;
    }
}

