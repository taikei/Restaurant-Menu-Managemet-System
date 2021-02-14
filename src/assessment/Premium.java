package assessment;

public class Premium extends MenuItem{

		// A premium menu item can be created with a mechanism to indicate that it is to have a surcharge
		// added to the price. The surcharge will increase the price of the meal based on a constant
		// percentage mark up value specified by the manager;
		
		// you decide the percentage for surcharge
	
	
	// This is the member unique to this class
	private double surcharge;

	public Premium(int itemNumber, String itemName, String description, double itemPrice, double surcharge) {
	// The fourth parameter is very long but needed for truncation of double value
		super(itemNumber, itemName, description, (double) Math.round((itemPrice + (itemPrice * surcharge / 100)) * 100) / 100);
		this.surcharge = surcharge;
	}
	
	@Override
	public void setItemPrice(double itemPrice) {
		this.itemPrice = (double) Math.round((itemPrice + (itemPrice * surcharge / 100)) * 100) / 100;
	}
	
	@Override
	public String toString() {
		String print;
		print = "\n--- Premium Menu ---" +
				"\nNumber: " + getItemNumber() +
				"\nName: " + getItemName() + 
				"\nDescription: " + getDescription() + 
				"\nPrice: " + getItemPrice() + "\n";
		
		return print;
	}
}

