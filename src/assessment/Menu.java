package assessment;

import java.util.ArrayList;

public class Menu {
	
	// Menu has a unique Id, name, purpose and venue and session time
	
	private int id;
	private String name;
	private String purpose;
	private String venue;
	private int sessionTime;
	
	
	private ArrayList<MenuItem> menu;
	
	
	public Menu() {
		
		// default constructor without parameters.
		// id has to be unique
	}
	
	public Menu(int id, String name, String purpose, String venue, int sessionTime) {
		// non-default constructor with parameters.
		// id has to be unique
		// session time is measured in second ex. 300 seconds.
	}
	
	public void addItem(MenuItem item) {
		// add new item to the menu
		this.menu.add(item);
	}
	
	public void removeItem(int index) {
		// remove item at the index passed as a prameter
	}
	
	public MenuItem retrieveItem() {
		// just return a single item
		// need to modify toString() in MenuItem class
		// to get the name of the MenuItem
	}
	
	public int findItem(MenuItem item) {
		// This is not requirement but nice to have.
		for(int i = 0; i < this.menu.size(); i++) {
			
		}
	}
	
	public String toString() {
		// Show details(purpose) of Menu and menu items in it
	}

	// Below is getters and setters
	// id shouldn't be changed because it has be unique
	// So I omitted the setter for ID
	
	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

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
