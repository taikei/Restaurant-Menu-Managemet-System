package assessment;



//In each of your specialised menu item classes, override the setItemPrice() method to perform
//an appropriate price calculation based on the data in the object.

public class MenuItem {

	private int itemNumber;
	// itemNumber has to be unique i guess
	private String itemName;
	private String description;
	protected double itemPrice;
	
	// 
	// another attribute may be needed as requirement say so...
	
	public MenuItem() {
		// default constructor without parameters
		// String members should be named as "unknown"
		// the price should be set to a minimum default price ($2.00? i dont know you decide lol)
		// any object should be null
		this.itemNumber = 0;
		this.itemName = "Unknown";
		this.description = "Unknown";
		this.itemPrice = 0.0;
		
	}
	
	public MenuItem(int itemNumber, String itemName, String description, double itemPrice) {
		
		// non-default constructor with parameters
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.description = description;
		this.itemPrice = itemPrice;
		
	}

	public int getItemNumber() {
		return this.itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public String toString() {
		String print;
		print = "\n----- Generic Menu -----" +
				"\nNumber: " + this.itemNumber +
				"\nName: " + this.itemName + 
				"\nDescription: " + this.description + 
				"\nPrice: " + this.itemPrice + 
				"\n";
		
		return print;
	}
	
}


