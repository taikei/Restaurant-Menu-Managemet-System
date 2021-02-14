package assessment;

public class Drink extends MenuItem{
	//Drinks menu item whose price will not have any surcharge and discounts.
	
	public Drink(int itemNumber, String itemName, String description, double itemPrice) {
		super(itemNumber, itemName, description, itemPrice);
	}
	
	@Override
	public String toString() {
		String print;
		print = "\n--- Drink Menu ---" +
				"\nNumber: " + getItemNumber() +
				"\nName: " + getItemName() + 
				"\nDescription: " + getDescription() + 
				"\nPrice: " + getItemPrice() + 
				"\n";
		
		return print;
	}
}
