package assessment;

import java.util.ArrayList;


public class Menu {
	
	// Menu has  Id, name, purpose and venue and session time
	
	private int id;
	private String name;
	private String purpose;
	private String venue;
	private int sessionTime;
	
	
	protected ArrayList<MenuItem> menu = new ArrayList<>();
	
	//default constructor without parameters.
	public Menu() {
		this.id = 0;
		this.name = "Unknown";
		this.purpose = "Unknown";
		this.venue = "Unknown";
		this.sessionTime = 0;
	}
	
	// non-default constructor with parameters.
	public Menu(int id, String name, String purpose, String venue, int sessionTime) {
		// session time is measured in second ex. 300 seconds.
		this.id = id;
		this.name = name;
		this.purpose = purpose;
		this.venue = venue;
		this.sessionTime = sessionTime;	
	}
	
	public void addItem(MenuItem item) {
		// add new item to the menu
		this.menu.add(item);
	}
	
	public void removeItem(String itemName) {
		// remove item from the arrayList
		int index = retrieveItem(itemName);
		
		if(index != -1) {
			this.menu.remove(index);
			System.out.println(itemName + " was removed from the menu.");
		}else {
			System.out.println(itemName + "was not found in the menu.");
		}
	}
	
	public void removeItem(MenuItem item) {
		// remove item from the arrayList
		int index = retrieveItem(item);
		if(index != -1) {
			this.menu.remove(index);
			System.out.println(item.getItemName() + " was removed from the menu.");
		} else {
			System.out.println(item.getItemName() + " was not found in the menu.");
		}
		
	}
	
	// retrieve item based on item name
	public int retrieveItem(String itemName) {
		for(MenuItem item: this.menu) {
			if(item.getItemName().equals(itemName)) {
				return this.menu.indexOf(item);
			}
		}	
		return -1; 
	}
	// retrieve item based on Item itself
	public int retrieveItem(MenuItem item) {
		return this.menu.indexOf(item);
	}
	
	public String toString() {
		// Show details(purpose) of Menu and menu items in it
		String print;
		print = "***** " + this.name + " *****\n" +
				"\nPurpose: " + this.purpose + 
				"\nVenue: " + this.venue + 
				"\n\n" +
				getMenu() +
				"\n" + 
				"*****************************";
		
		return print;
	}

	// Below is getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public int getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(int sessionTime) {
		this.sessionTime = sessionTime;
	}

	public ArrayList<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<MenuItem> menu) {
		this.menu = menu;
	}
	
	
	
	
	
}
