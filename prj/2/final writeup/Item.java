public class Item{
	
	int itemID = 0;
	String itemName = "";
	double price = 0;
	
	public Item(int id, String name, double p) {
		itemID = id;
		itemName = name;
		price = p;
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public double getItemPrice() {
		return price;
	}
}

