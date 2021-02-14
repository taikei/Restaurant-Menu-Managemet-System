package assessment;

public class Discounted extends MenuItem {
	// 5% discount
	private static double discount = 5.0;
	
	
	public Discounted(int itemNumber, String itemName, String description, double itemPrice) {
	// The fourth parameter is very long but needed for truncation of double value
		super(itemNumber, itemName, description, (double) Math.round((itemPrice - (itemPrice * discount / 100)) * 100) / 100);
		
	}
	
	@Override
	public void setItemPrice(double itemPrice) {
		this.itemPrice = (double) Math.round((itemPrice + (itemPrice * discount / 100)) * 100) / 100;
	}
	
	@Override
	public String toString() {
		String print;
		print = "\n--- Discounted Menu ---" +
				"\nNumber: " + getItemNumber() +
				"\nName: " + getItemName() + 
				"\nDescription: " + getDescription() + 
				"\nPrice: " + getItemPrice() + 
				"\n";
		return print;
	}
}
