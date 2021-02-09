package assessment;

public class Standard extends MenuItem {
		// A standard menu item will have the price calculated based exactly on the price entered into the
		//system.

	public Standard(int itemNumber, String itemName, String description, double itemPrice) {
		super(itemNumber, itemName, description, itemPrice);
	}
	
	@Override
	public String toString() {
		String print;
		print = "\n--- Standard Menu ---" +
				"\nNumber: " + getItemNumber() +
				"\nName: " + getItemName() + 
				"\nDescription: " + getDescription() + 
				"\nPrice: " + getItemPrice() + "\n";
		
		return print;
	}
}
