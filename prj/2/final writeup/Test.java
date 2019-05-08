import java.util.*;

public class Test{
	
	// Create some super accounts (username, password)
	static Account acc1 = new Account("bwayne", "batman!!", 92840);
	static Account acc2 = new Account("clarkkent", "21super12@@", 28472);
	static Account acc3 = new Account("hulk", "greenman321$", 64907);
	//Each account has it's own transaction
	static Transaction t1 = new Transaction(acc1);
	static Transaction t2 = new Transaction(acc2);
	static Transaction t3 = new Transaction(acc3);
	//Add bank accounts
	static Bank ba1 = new Bank("Chase", 92840, 20000000);
	static Bank ba2 = new Bank("People's", 28472, 100);
	static Bank ba3 = new Bank("Bank of America", 64907, 1500100);
	
	public static void main(String[] args) {
		//Allow for input
		Scanner input = new Scanner(System.in);
		
		//Login with correct credentials
		System.out.println("Welcome to my store!");
		
		System.out.println("Username: ");
		String u = input.next();
		if (u.equals(acc1.username)){
			System.out.println("Password:");
			String pass = input.next();
			if(pass.equals(acc1.password)){
				//Shopping
				browsing();
				//Total
				System.out.println("Total for " + acc1.getUser() + " is: " + t1.getTransactionPrice());
				//Purchase
				if(ba1.getBankBalance() > 0){
					System.out.println("Purchase successful!");
				}else{
					System.out.println("Purchase unsuccessful.");
				}
			}else{
				System.out.print("Incorrect password");
			}
		}else if(u.equals(acc2.username)){
			System.out.println("Password:");
			String pass = input.next();
			if(pass.equals(acc2.password)){
				//Shopping
				browsing();
				//Total
				System.out.println("Total for " + acc2.getUser() + " is: " + t2.getTransactionPrice());
				//Purchase
				if(ba2.getBankBalance() > 0){
					System.out.println("Purchase successful!");
				}else{
					System.out.println("Purchase unsuccessful.");
				}
			}else{
				System.out.print("Incorrect password");
			}
			
		}else if(u.equals(acc3.username)){
				System.out.println("Password:");
				String pass = input.next();
				if(pass.equals(acc3.password)){
					//Shopping
					browsing();
					//Total
					System.out.println("Total for " + acc3.getUser() + " is: " + t3.getTransactionPrice());
					//Purchase
					if(ba3.getBankBalance() > 0){
						System.out.println("Purchase successful!");
					}else{
						System.out.println("Purchase unsuccessful.");
					}
				}else{
					System.out.print("Incorrect password");
				}
		}else{
			System.out.println("Not a member");
		}
		System.exit(0);
	}
	
	public static void browsing() {
		int itemNum = 0;
		
		// Create some Items : (itemID, itemName, price)
		Item shirt = new Item(0001, "Shirt", 15.75);
		Item pants = new Item(0002, "Pants", 20.15);
		Item batSuit = new Item(0003, "Bat Suit", 1500024.57);
		Item boots = new Item(0004, "Boots", 45.38);
		Item belt = new Item(0005, "Belt", 7.53);
		Item dress = new Item(0006, "Dress", 100.23);
		Item jacket = new Item(0007, "Jacket", 529.43);
		Item sweater = new Item(0010, "Sweater", 58.32);
		Item shorts = new Item(0011, "Shorts", 36.67);
		Item magicRock = new Item(0012, "Magic Rock", 1234567.89);
		
		Scanner input = new Scanner(System.in);
		
		//catalog
		while(itemNum != 11){
			System.out.println("What do you want to buy?");
			System.out.println("1. " + shirt.getItemName() + " $" + shirt.getItemPrice());
			System.out.println("2. " + pants.getItemName() + " $" + pants.getItemPrice());
			System.out.println("3. " + batSuit.getItemName() + " $" + batSuit.getItemPrice());
			System.out.println("4. " + boots.getItemName() + " $" + boots.getItemPrice());
			System.out.println("5. " + belt.getItemName() + " $" + belt.getItemPrice());
			System.out.println("6. " + dress.getItemName() + " $" + dress.getItemPrice());
			System.out.println("7. " + jacket.getItemName() + " $" + jacket.getItemPrice());
			System.out.println("8. " + sweater.getItemName() + " $" + sweater.getItemPrice());
			System.out.println("9. " + shorts.getItemName() + " $" + shorts.getItemPrice());
			System.out.println("10. " + magicRock.getItemName() + " $" + magicRock.getItemPrice());
			System.out.println("11. None");
			System.out.println("Enter the number of the item you wish to buy");
			
			itemNum = input.nextInt();
			
			//purchase items
			switch(itemNum){
				case 1:
					t1.addToCart(shirt);
					break;
				case 2:
					t1.addToCart(pants);
					break;
				case 3:
					t1.addToCart(batSuit);
					break;
				case 4:
					t1.addToCart(boots);
					break;
				case 5:
					t1.addToCart(belt);
					break;
				case 6:
					t1.addToCart(dress);
					break;
				case 7:
					t1.addToCart(jacket);
					break;
				case 8:
					t1.addToCart(sweater);
					break;
				case 9:
					t1.addToCart(shorts);
					break;
				case 10:
					t1.addToCart(magicRock);
					break;
				default:
					break;
			}
		}
	}
	
}


