import java.util.*;  

public class Lab4num6{  
   public static void main(String args[]){  
	  List mylist = new ArrayList(); 
      mylist.add(1);
      mylist.add(2);
      mylist.add(3);
      mylist.add(4);
      mylist.add(5);
      mylist.add(6);
      mylist.add(7);
      mylist.add(8);
      mylist.add(9);
      mylist.add(10);
  

      System.out.println(mylist);
  
      mylist.add(new Integer (-1));
      System.out.println("Added -1 to end of list " + mylist);

      mylist.add(5, 22);
      System.out.println("Put number 22 to position 5 " + mylist);
      
      mylist.add(2, 10);
      System.out.println("Inserted 10 to position 3 " + mylist);
      
      mylist.add(6, 100);
      System.out.println("Inserted 100 to position 7 " + mylist);
      
   }  
}