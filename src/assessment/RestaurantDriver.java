package assessment;

public class RestaurantDriver {
	
	// This variable is to assign ID automatically
	static int idCounter = 0;

	public static void main(String[] args) {
		
		
		
		// create 2 different menus
		// Id, name, purpose and venue and session time
		// - take-away
		Menu takeaway = new Menu(1, "Takeaway Menu", "This menu is for takeaway", "Sydney", 300);
		// - dine-in
		
		// create:
		// - 10 standard menu items
		// - 10 preminum menu items
		// - 10 discounted menu items
		// - 10 drinks
		MenuItem standardOne = new Standard(id(), "Hamburger", "Classic Burger", 6.0);
		MenuItem standardTwo = new Standard(id(), "Hamburger", "Classic Burger", 6.0);
		MenuItem standardThree = new Standard(id(), "Hamburger", "Classic Burger", 6.0);
		MenuItem standardFour = new Standard(id(), "Hamburger", "Classic Burger", 6.0);
//		System.out.println(standardOne);
//		System.out.println(standardTwo);
//		System.out.println(standardThree);
//		System.out.println(standardFour);
//		
		MenuItem premiumOne = new Premium(id(), "Hamburger", "Classic Burger", 6.0, 3.5);
		//System.out.println(premiumOne);
		
		MenuItem discountedOne = new Discounted(id(), "Hamburger", "Classic Burger", 2.0);
		//System.out.println(discountedOne);
		
		MenuItem drinkOne = new Drink(id(), "Coke", "Classic Coca Cola", 3.0);
		//System.out.println(drinkOne);
		// fill each Menu with 5-7 MenuItems from each category
		
		
		
		
		// display a welcome messaage to screen to show the name of system
		// details of students 
		
		
		// Ask user if they want to place order
		// if yes, ask the name and status of customer
		// Status has to be "New", "Active" or "VIP" 
		
		
		// Once user enters their name and status
		// show 2 different menu(take-away and dine-in) and ask user to select one
		// after user decide which menu, show menu items in the menu
		// ask user to to enter the items they want in their order
		
		// user will use the number to add the items and
		// can addone item more than once. keep asking until they finish ordering.
		
		
		// when user wish to finish order, program should calculate 
		// the total of all items and deducting customer dicount accordingly
		
		// add 2.5% service charge on dine-in orders
		
		
		// display the total amont due with alla the details of order
		takeaway.addItem(standardOne);
		takeaway.addItem(premiumOne);
		takeaway.addItem(discountedOne);
		takeaway.addItem(drinkOne);
		
		System.out.println(takeaway);
	}
	
	
	// This method is to assign ID automatically
	private static int id() {
		idCounter++;
		return idCounter;
	}
	

}
