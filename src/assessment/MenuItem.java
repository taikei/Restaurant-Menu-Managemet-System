package assessment;



public class MenuItem {

	private int itemNumber;
	// itemNumber has to be unique i guess
	private String itemName;
	private String description;
	private double itemPrice;
	
	// 
	// another attribute may be needed as requirement say so...
	
	public MenuItem() {
		// default constructor without parameters
		// String members should be named as "unknown"
		// the price should be set to a minimum default price ($2.00? i dont know you decide lol)
		// any object should be null
		
	}
	
	public MenuItem(int itemNumber, String itemName, String description, double itemPrice) {
		
		// non-default constructor with parameters
		
	}

	public int getItemNumber() {
		return itemNumber;
	}

	// Setter for item number is unnecessary
//	public void setItemNumber(int itemNumber) {
//		this.itemNumber = itemNumber;
//	}

	public String getItemName() {
		return itemName;
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
		//Write a toString() method in each class that will return a String containing all the
		//relevant data for each of your objects.
	}
	
	
	
}


//In each of your specialised menu item classes, override the setItemPrice() method to perform
//an appropriate price calculation based on the data in the object.


public class Standard extends MenuItem {
	
	// A standard menu item will have the price calculated based exactly on the price entered into the
	//system.
}

public class Premium extends MenuItem {
	
	// A premium menu item can be created with a mechanism to indicate that it is to have a surcharge
	// added to the price. The surcharge will increase the price of the meal based on a constant
	// percentage mark up value specified by the manager;
	
	// you decide the percentage for surcharge
}

public class Discounted extends MenuItem {
	// 5% discount
}

public class Drink extends MenuItem {
	//Drinks menu item whose price will not have any surcharge and discounts.
}


