import java.util.*;

public class Transaction {

	int transactionID = 0;
	static ArrayList<Item> cart = new ArrayList<Item>();
	Account account;
	
	public Transaction(Account acc) {
		account = acc;
	}
	
	public void addToCart(Item item) {
		cart.add(item);
	}

	public static double getTransactionPrice() {
		double totalPrice = 0;
		for(Item i : cart) {
			totalPrice += i.getItemPrice();
		}
		return totalPrice;
	}
}

