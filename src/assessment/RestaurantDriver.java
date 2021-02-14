package assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantDriver {
	
	// These variable is used to assign unique ID
	static int idCounter = 0;
	static int menuID = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// - take-away
		Menu takeAway = new Menu(menuID(), "Takeaway Menu", "This menu is for Takeaway", "Ratatouille", 300);
		// - dine-in
		Menu dineIn = new Menu(menuID(), "Dine-in Menu", "This menu is for Dine-in", "Ratatouille", 300);
		
		// create:
		// - 10 standard menu items
		MenuItem standard1 = new Standard(id(), "Hamburger", "Classic burger", 6.5);
		MenuItem standard2 = new Standard(id(), "Chips", "Chips with sea salt", 4.0);
		MenuItem standard3 = new Standard(id(), "Smashed Potatoes", "Fresh smashed potatoes", 4.5);
		MenuItem standard4 = new Standard(id(), "Pie", "Hot creamie pie", 3.5);
		MenuItem standard5 = new Standard(id(), "Meat Loaf", "Delicious meat loaf", 10.0);
		MenuItem standard6 = new Standard(id(), "Spaghetti", "Mediterennian style spaghetti", 12.0);
		MenuItem standard7 = new Standard(id(), "Stew", "Slow cooked stew", 10.0);
		MenuItem standard8 = new Standard(id(), "Steak", "Cheek-dropping steak", 20.0);
		MenuItem standard9 = new Standard(id(), "Schnitzel", "Fresh Schnitzel", 8.0);
		MenuItem standard10 = new Standard(id(), "Salad", "Fresh salad", 6.5);
		
		// - 10 preminum menu items
		MenuItem premium1 = new Premium(id(), "Sushi", "Japanese sushi", 9.0, 5.0);
		MenuItem premium2 = new Premium(id(), "Tacos", "Mexican tacos", 6.0, 5.0);
		MenuItem premium3 = new Premium(id(), "Cheese Burger", "USA style cheese burger", 7.5, 5.0);
		MenuItem premium4 = new Premium(id(), "Tom yam kung", "Authentic Thai tom yum kung", 10.5, 5.0);
		MenuItem premium5 = new Premium(id(), "Momo", "Delicious meat loaf with garlic bread", 13.0, 5.0);
		MenuItem premium6 = new Premium(id(), "Pho", "Slow cooked Vietnamese pho", 12.0, 5.0);
		MenuItem premium7 = new Premium(id(), "Churros", "Spanish churros", 8.0, 5.0);
		MenuItem premium8 = new Premium(id(), "Dim sum", "Traditional Chinese dim sum", 8.0, 5.0);
		MenuItem premium9 = new Premium(id(), "Dal", "Authentic Indian dal", 12.0, 5.0);
		MenuItem premium10 = new Premium(id(), "Pizza", "Traditional Italian pizza", 15.5, 5.0);
	
		
		// - 10 discounted menu items
		MenuItem discounted1 = new Discounted(id(), "Toast", "Toast for breakfast", 4.0);
		MenuItem discounted2 = new Discounted(id(), "Soup", "Corn soup", 5.0);
		MenuItem discounted3 = new Discounted(id(), "Calamari", "Frozen calamari", 5.0);
		MenuItem discounted4 = new Discounted(id(), "Fried Chicken", "Fried chicken 3 pcs", 5.0);
		MenuItem discounted5 = new Discounted(id(), "Cake", "Baked by chef", 5.0);
		MenuItem discounted6 = new Discounted(id(), "Cup Cake", "Small cupcake", 4.0);
		MenuItem discounted7 = new Discounted(id(), "Waffle", "Bought waffle", 5.0);
		MenuItem discounted8 = new Discounted(id(), "Ice Cream", "Vanilla ice cream", 3.0);
		MenuItem discounted9 = new Discounted(id(), "Garlic Bread", "Bought garlic bread", 3.0);
		MenuItem discounted10 = new Discounted(id(), "Pancake", "home-made pancake", 7.0);
		
		// - 10 drinks
		MenuItem drink1 = new Drink(id(), "Coke", "Classic Coca Cola", 3.0);
		MenuItem drink2 = new Drink(id(), "Water", "Mineral water", 3.0);
		MenuItem drink3 = new Drink(id(), "Sprite", "Sprite", 3.0);
		MenuItem drink4 = new Drink(id(), "Milk Tea", "Sweet milk tea", 3.0);
		MenuItem drink5 = new Drink(id(), "Coffee", "Hot/Ice coffee", 3.0);
		MenuItem drink6 = new Drink(id(), "Sparkling Water", "Healthy sparkling water", 3.0);
		MenuItem drink7 = new Drink(id(), "Green tea", "antiageing green tea", 3.0);
		MenuItem drink8 = new Drink(id(), "Wine", "Red/White/Rose wine", 7.0);
		MenuItem drink9 = new Drink(id(), "Beer", "Locally crafted beer", 7.0);
		MenuItem drink10 = new Drink(id(), "Cocktail", "Beautiful cocktail", 7.0);
		
		// fill each Menu with 5-7 MenuItems from each category
		
		takeAway.addItem(standard1);
		takeAway.addItem(standard3);
		takeAway.addItem(premium1);
		takeAway.addItem(discounted1);
		takeAway.addItem(discounted3);
		takeAway.addItem(drink1);
		takeAway.addItem(drink3);
		
		dineIn.addItem(standard4);
		dineIn.addItem(standard7);
		dineIn.addItem(premium4);
		dineIn.addItem(discounted4);
		dineIn.addItem(discounted7);
		dineIn.addItem(drink4);
		dineIn.addItem(drink7);
		
		// display a welcome messaage to screen to show the name of system
		// details of students 
		
		System.out.println("------ Welcome to Ratatouille ------\n" + 
							"\nThis system was developed by " + 
							"\nTaikei Nakano - K190064" + 
							"\nLukas Puncochar - K200875" + 
							"\nLuiz Augusto Santo - K200867" + 
							"\nKehyan Naveed - K200911");
	
		
		// Ask user if they want to place order
		System.out.println(" \n" + "Would you like to place orders?\n" + 
							"1. Yes\n" + 
							"2. No");
		int userAnswer = 0;
		
		do {
			userAnswer = scanner.nextInt();
		}while(userAnswer < 1 || userAnswer > 2);
		
		if(userAnswer == 2) {
			System.out.println("See you later!");
			return;
		}
		
		// if yes, ask the name and status of customer
		// Status has to be "New", "Active" or "VIP" 
				
		System.out.println("\nPlease type your name.");
		String customerName = scanner.nextLine();
		
		// This scanner.nextLine() is needed.
		scanner.nextLine();
		System.out.println("\nWhat is your status?" + 
							"\n1. Active" + 
							"\n2. VIP" + 
							"\n3. New Customer");
		int statusNum;
		do {
			statusNum = scanner.nextInt();
		}while(userAnswer < 1 || userAnswer > 3);
		
		String customerStatus = "Unknown";
		if(statusNum == 1) {
			customerStatus = "Active";
		} else if (statusNum == 2) {
			customerStatus = "VIP";
		} else if (statusNum == 3) {
			customerStatus = "New Customer";
		}
		
		Customer customer = new Customer(customerName, customerStatus);
		// Once user enters their name and status
		// show 2 different menu(take-away and dine-in) and ask user to select one
		
		System.out.println("\nPlease select a menu." + 
							"\n1. Dine-in" + 
							"\n2. TakeAway");
		
		//menuNum 1 = Dine-in
		//MenuNum 2 = takeAway
		int menuNum = 0;	
		Menu userMenu = null;
		//This is the araylist to keep records of customer order
		ArrayList<MenuItem> customerOrders = new ArrayList<>();
		//This is the input for order
		int userOrder = -1;
		double surcharge = 0.0;
		
		do {
			menuNum = scanner.nextInt();
		}while(menuNum < 1 || menuNum > 2);
		
		// after user decide which menu, show menu items in the menu
		
		if(menuNum == 1) {
			userMenu = dineIn;
			surcharge = 0.025;
			System.out.println("\n" + userMenu);
		}else if(menuNum == 2) {
			userMenu = takeAway;
			System.out.println("\n" + userMenu);
		}
	
		// ask user to to enter the items they want in their order
		
		
		
		System.out.println("\nPlease type the item number to place orders." + 
							"\nTo cancel, please type 0");
		
		// user will use the number to add the items and
		// can add one item more than once. keep asking until they finish ordering.
		
		
		while(userOrder != 0) {
			
			userOrder = scanner.nextInt();
			if(userOrder == 0) {
				break;
			}
			// comparing user input to each item number of the item in the selected menu
			for(int i = 0; i < userMenu.menu.size(); i++) {
				if(userOrder == userMenu.menu.get(i).getItemNumber()) {
					customerOrders.add(userMenu.menu.get(i));
				}
			}
			
			System.out.println("\nYou have selected:");
			for(MenuItem menu: customerOrders) {
				System.out.println(menu.getItemName() + " " + menu.getItemPrice());
			}
			
			System.out.println("\nPlease type the item number to place orders." + 
					"\nTo finish ordering, please type 0");
			
		}
		
		// when user wish to finish order, program should calculate 
		// the total of all items and deducting customer discount accordingly
		// add 2.5% service charge on dine-in orders		
		// display the total amount due with alla the details of order
			
		
		double subtotal = 0;
		double total = 0;
		
	
		System.out.println("\n===== Invoice =====");
		for(int i = 0; i < customerOrders.size(); i++) {
			subtotal += customerOrders.get(i).getItemPrice();
			System.out.println(customerOrders.get(i).getItemName() + ": $" + customerOrders.get(i).getItemPrice());
		}
		double discount = (double) Math.round((subtotal * customer.getDiscount() * 100) / 100);
		total = subtotal - discount;
		if(surcharge != 0.0) {
			total = total + (subtotal * surcharge);
		}
		
		
		System.out.println("\nSubtotal: $" + subtotal + 
							"\nDiscount: $" + discount + 
							"\nSurcharge: " + (surcharge * 100) + "%" + 
							"\nTotal: " + total);
		
		System.out.println("\nThank you!!");
		
	}
	
	
	// This method is to assign ID to menu items automatically
	private static int id() {
		idCounter++;
		return idCounter;
	}
	
	// This method is used to assign menu to unique ID
	private static int menuID() {
		menuID++;
		return menuID;
	}
	

}
